package mx.com.cetech.clientes.model.base;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractBaseEntity<ID extends Serializable> implements Serializable, Comparable<ID> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4924802157338215055L;

	public abstract boolean equals(Object obj);
	
	public abstract int hashCode();

}
