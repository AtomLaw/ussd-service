package vn.com.vndirect.ussd.test.service;

import static org.junit.Assert.assertEquals;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import vn.com.vndirect.ussd.service.HelloService;

@ContextConfiguration({ "classpath:spring-test-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloworldServiceTest {
	
	@Autowired
	private CamelContext camelContext;

	@Autowired
	private ProducerTemplate template;
	
	private ProcessMock processMock;
	
	private HelloService service;

	@Before
	public void setUp() throws Exception {
		
		processMock = new ProcessMock();
		
		camelContext.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from("spring-amqp::processqueue:processqueue").bean(processMock);
			}
		});
		
		service = new HelloService();
		service.setProducerTemplate(template);
	}

	@Test
	public void test() {
		String result = service.sayHello();		
		assertEquals("hi", result);
	}
}