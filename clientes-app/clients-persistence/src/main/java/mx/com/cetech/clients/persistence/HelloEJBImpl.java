package mx.com.cetech.clients.persistence;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Local(IHelloEJB.class)
@Stateless
public class HelloEJBImpl implements IHelloEJB{

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return null;
	}

}
