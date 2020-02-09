package mx.com.cetech.clients.persistence.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import lombok.Getter;
import lombok.Setter;
import mx.com.cetech.clientes.model.base.AbstractBaseEntity;

public abstract class AbstractBaseDAO<ID extends Serializable, E extends AbstractBaseEntity<ID>> {

	private static final String AS_O = " as o";
	private static final String SELECT_OBJECT_O_FROM = "select object(o) from ";

	@PersistenceContext(unitName = "ClientsPU")
	@Setter
	@Getter
	protected EntityManager entityManager;

	protected Class<E> entityClass;

	protected AbstractBaseDAO(Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	public E findOne(ID id) {
		return getEntityManager().find(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		return getEntityManager().createQuery(SELECT_OBJECT_O_FROM + entityClass.getSimpleName() + AS_O)
				.getResultList();
	}

	public void save(E entity) {
		getEntityManager().persist(entity);
	}

	public void delete(E entity) {
		getEntityManager().remove(getEntityManager().merge(entity));
	}

}
