package mx.com.cetech.clients.persistence.dao;

import java.io.Serializable;
import java.util.List;

import mx.com.cetech.clientes.model.base.AbstractBaseEntity;

public interface IBaseDAO<ID extends Serializable, E extends AbstractBaseEntity<ID>> {
	
	E findOne(ID id);
	
	List<E> findAll();
	
	void save(E entity);
	
	void delete(E entity);

}
