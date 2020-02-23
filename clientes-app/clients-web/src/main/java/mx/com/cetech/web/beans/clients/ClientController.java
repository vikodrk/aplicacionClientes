package mx.com.cetech.web.beans.clients;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import lombok.Getter;
import lombok.Setter;
import mx.com.cetech.clients.commons.to.ClientsTO;
import mx.com.cetech.services.IClientServiceEJB;

@ManagedBean(name = "clientsMb")
@ViewScoped
@Getter
@Setter
public class ClientController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8924092518127427653L;

	@EJB
	private IClientServiceEJB clientsService;

	private String name;
	private String firstName;
	private String lastName;
	private String cellphone;
	private String email;

	public void saveClient() {
		ClientsTO client = ClientsTO.builder().cellPhone(cellphone).email(email).firstName(firstName).lastName(lastName)
				.name(name).build();
		clientsService.createClient(client);
	}

}
