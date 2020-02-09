package mx.com.cetech.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.com.cetech.clientes.model.Clients;
import mx.com.cetech.clients.commons.to.ClientsTO;
import mx.com.cetech.clients.persistence.dao.IClientsDAO;
import mx.com.cetech.services.IClientServiceEJB;
import mx.com.cetech.services.mappers.ClientMapper;

@Remote(IClientServiceEJB.class)
@Stateless
public class ClientServiceImpl implements IClientServiceEJB {

	@EJB
	private IClientsDAO clientDAO;

	@EJB
	private ClientMapper mapper;

	@Override
	public void createClient(ClientsTO client) {
		clientDAO.save(mapper.clientsNewEntityMapper.apply(client));
	}

	@Override
	public List<ClientsTO> findAllClients() {
		return Optional.ofNullable(clientDAO.findAll()).orElseGet(ArrayList::new).stream().map(mapper.clientsTOMapper)
				.collect(Collectors.toList());
	}

	@Override
	public ClientsTO findClient(Long idClient) {
		return mapper.clientsTOMapper.apply(Optional.ofNullable(clientDAO.findOne(idClient)).orElseGet(Clients::new));
	}

}
