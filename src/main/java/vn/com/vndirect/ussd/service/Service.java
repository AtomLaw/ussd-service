package vn.com.vndirect.ussd.service;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	
	@Autowired
	protected ProducerTemplate template;
	
	public void setProducerTemplate(ProducerTemplate template) {
		this.template = template;
	}
 
}