package mx.com.cetech.clientes.model.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public abstract class AbstractSignedEntity<ID extends Serializable> extends AbstractBaseEntity<ID> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2125352837400896140L;

	@Column(name = "ACTIVE", nullable = false)
	@Setter
	@Getter
	private Boolean active = true;

	@Column(name = "LAST_USER_MODIFIER", nullable = false)
	@Setter
	@Getter
	private Long lastUserModifier;

	@Column(name = "LAST_MODIFICATION", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModification;

	public Date getLastModification() {
		return lastModification == null ? null : (Date) lastModification.clone();
	}

	public void setLastModification(Date lastModification) {
		this.lastModification = lastModification == null ? null : (Date) lastModification.clone();
	}

}
