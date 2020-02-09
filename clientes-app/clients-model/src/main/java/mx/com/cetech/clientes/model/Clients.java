package mx.com.cetech.clientes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import mx.com.cetech.clientes.model.base.AbstractBaseEntity;

@Entity
@Table(name = "CLIENTS")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Clients extends AbstractBaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8525371045607676354L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENT")
	@Setter
	@Getter
	private Long id;

	@Column(name = "NAME")
	@Setter
	@Getter
	private String name;

	@Column(name = "FIRST_NAME")
	@Setter
	@Getter
	private String firstName;

	@Column(name = "LAST_NAME")
	@Setter
	@Getter
	private String lastName;

	@Setter
	@Getter
	@Column(name = "CELL_PHONE")
	private String cellPhone;

	@Column(name = "EMAIL")
	@Setter
	@Getter
	private String email;

	@Column(name = "SIGNUP_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date signUp;

	@Override
	public int compareTo(Long o) {
		return id.compareTo(o);
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj != null) {
			if (obj == this) {
				flag = true;
			} else if (obj.getClass() == this.getClass()) {
				flag = new EqualsBuilder().append(id, ((Clients) obj).id).isEquals();
			}
		}
		return flag;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).toHashCode();
	}

	public Date getSignUp() {
		return signUp == null ? null : (Date) signUp.clone();
	}

	public void setSignUp(Date signUp) {
		this.signUp = signUp == null ? null : (Date) signUp.clone();
	}

}
