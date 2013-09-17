/**
 * 
 */
package com.hunthawk.framework;

import java.io.Serializable;
import java.util.List;

/**
 * @author sunquanzhi
 *
 */
public interface EntityController<T> {
	T get(Serializable id);

	List<T> getAll();

	void persist(Object o);
	
	void update(Object o);
	

	void delete(Object o);

	void deleteById(Serializable id);

	/**
	 * ��ȡEntity�����������.
	 */
	String getIdName(Class clazz);
}
