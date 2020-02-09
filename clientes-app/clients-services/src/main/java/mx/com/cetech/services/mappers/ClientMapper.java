package mx.com.cetech.services.mappers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.function.Function;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import mx.com.cetech.clientes.model.Clients;
import mx.com.cetech.clients.commons.to.ClientsTO;

@LocalBean
@Stateless
public class ClientMapper {

	public Function<ClientsTO, Clients> clientsNewEntityMapper = this::buildNewEntity;

	public Function<Clients, ClientsTO> clientsTOMapper = this::buildTO;

	private ClientsTO buildTO(Clients entity) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return ClientsTO.builder().cellPhone(entity.getCellPhone()).email(entity.getEmail())
				.firstName(entity.getFirstName()).id(entity.getId()).lastName(entity.getLastName())
				.name(entity.getName())
				.signUp(formatter
						.format(entity.getSignUp() == null ? Calendar.getInstance().getTime() : entity.getSignUp()))
				.build();
	}

	private Clients buildNewEntity(ClientsTO to) {
		return Clients.builder().cellPhone(to.getCellPhone()).email(to.getEmail()).firstName(to.getFirstName())
				.id(to.getId()).lastName(to.getLastName()).name(to.getName()).signUp(Calendar.getInstance().getTime())
				.build();
	}

}
