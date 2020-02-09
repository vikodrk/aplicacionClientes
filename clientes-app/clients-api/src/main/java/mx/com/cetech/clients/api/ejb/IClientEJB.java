package mx.com.cetech.clients.api.ejb;

import java.util.List;

import mx.com.cetech.clients.commons.to.ClientsTO;

public interface IClientEJB {

	void createClient(ClientsTO client);

	List<ClientsTO> findAllClients();

	ClientsTO findClient(Long idClient);
}
