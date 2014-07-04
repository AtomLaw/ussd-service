package vn.com.vndirect.ussd.test.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import vn.com.vndirect.ussd.service.HelloService;

@ContextConfiguration({ "classpath:spring-test-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class InitializeBeanTest {
	
	@Autowired
	private HelloService helloWorldService;

	@Test
	public void test() {
		assertNotNull(helloWorldService);
	}
}

