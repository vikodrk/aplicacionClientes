package mx.com.cetech.services;

import java.util.List;

import mx.com.cetech.clients.commons.to.ClientsTO;

public interface IClientServiceEJB {

	void createClient(ClientsTO client);

	List<ClientsTO> findAllClients();

	ClientsTO findClient(Long idClient);

}
