package mx.com.cetech.services;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Local(IServicesHelloEJB.class)
@Stateless
public class ServicesHelloEJBImpl implements IServicesHelloEJB {

	@Override
	public String hello() {
		return "hello from services";
	}

}
