package mx.com.cetech.clients.commons.to;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ClientsTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3092921724009884471L;

	private Long id;
	private String name;
	private String firstName;
	private String lastName;
	private String cellPhone;
	private String email;
	private String signUp;

}
