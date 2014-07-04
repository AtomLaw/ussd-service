package vn.com.vndirect.ussd.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloService extends Service {

	@WebMethod(operationName = "sayHello")
	public String sayHello() {

		return "hello";
	}

}