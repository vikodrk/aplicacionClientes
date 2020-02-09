package mx.com.cetech.services.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;

import mx.com.cetech.services.IServicesHelloEJB;

@Local(IServicesHelloEJB.class)
@Stateless
public class ServicesHelloEJBImpl implements IServicesHelloEJB {

	@Override
	public String hello() {
		return "hello from services";
	}

}
