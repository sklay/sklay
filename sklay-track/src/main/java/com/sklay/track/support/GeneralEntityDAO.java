package com.sklay.track.support;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityNotFoundException;

import com.sklay.core.ex.SklayException;

/**
 * 
 * .
 * <p/>
 * 
 * @author <a href="mailto:1988fuyu@163.com">fuyu</a>
 * 
 * @version v1.0 2013-8-9
 */
public interface GeneralEntityDAO<E, PK extends Serializable> {

	E save(E entity) throws SklayException;

	void deleteByPk(PK id) throws SklayException;

	void delete(E entity);

	void batchDeleteByPK(Collection<PK> ids);

	void batchDelete(Collection<E> entities);

	E get(PK id);

	E load(PK id) throws EntityNotFoundException;

	Map<PK, E> batchGet(Collection<PK> ids);

	List<E> getAll();
}