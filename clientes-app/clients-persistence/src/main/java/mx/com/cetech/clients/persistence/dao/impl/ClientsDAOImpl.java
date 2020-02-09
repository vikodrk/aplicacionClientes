package mx.com.cetech.clients.persistence.dao.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;

import mx.com.cetech.clientes.model.Clients;
import mx.com.cetech.clients.persistence.dao.IClientsDAO;

@Local(IClientsDAO.class)
@Stateless
public class ClientsDAOImpl extends AbstractBaseDAO<Long, Clients> implements IClientsDAO {

	public ClientsDAOImpl() {
		super(Clients.class);
	}


}
