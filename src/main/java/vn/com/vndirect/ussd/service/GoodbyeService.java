package vn.com.vndirect.ussd.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class GoodbyeService extends Service {

	@WebMethod(operationName = "sayGoodbye")
	public String sayGoodbye() {

		return "goodbye";
	}

}