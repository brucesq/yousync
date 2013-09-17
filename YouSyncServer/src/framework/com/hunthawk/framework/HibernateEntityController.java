/**
 * 
 */
package com.hunthawk.framework;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;

import com.hunthawk.framework.util.GenericsUtils;

/**
 * @author sunquanzhi
 * 
 */
@SuppressWarnings("unchecked")
public class HibernateEntityController<T> extends HibernateGenericController
		implements EntityController<T> {
	protected Class<T> clasz;// Entity����.

	/**
	 * <p>
	 * �ڹ��캯���н�����T.class����clasz.
	 * </p>
	 */
	public HibernateEntityController() {
		clasz = GenericsUtils.getSuperClassGenricType(getClass());
	}

	/**
	 * <p>
	 * ȡ��clasz.
	 * </p>
	 */
	protected Class<T> getEntityClass() {
		return clasz;
	}

	/**
	 * <p>
	 * ����ID��ȡ����.
	 * </p>
	 * 
	 * @see HibernateGenericDao#getId(Class,Object)
	 */
	public T get(Serializable id) {
		return get(getEntityClass(), id);
	}

	/**
	 * <p>
	 * ��ȡȫ������
	 * </p>
	 * 
	 * @see HibernateGenericDao#getAll(Class)
	 */
	public List<T> getAll() {
		return getAll(getEntityClass());
	}

	/**
	 * <p>
	 * ��ȡȫ������,���������.
	 * </p>
	 * 
	 * @see HibernateGenericDao#getAll(Class,String,boolean)
	 */
	public List<T> getAll(String orderBy, boolean isAsc) {
		return getAll(getEntityClass(), orderBy, isAsc);
	}

	/**
	 * <p>
	 * ����ID�Ƴ�����.
	 * </p>
	 * 
	 * @see HibernateGenericDao#removeById(Class,Serializable)
	 */
	public void deleteById(Serializable id) {
		deleteById(getEntityClass(), id);
	}

	/**
	 * <p>
	 * ȡ��Entity��Criteria.
	 * </p>
	 * 
	 * @see HibernateGenericDao#createCriteria(Class,Criterion[])
	 */
	public Criteria createCriteria(Criterion... criterions) {
		return createCriteria(getEntityClass(), criterions);
	}

	/**
	 * <p>
	 * ȡ��Entity��Criteria,���������.
	 * </p>
	 * 
	 * @see HibernateGenericDao#createCriteria(Class,String,boolean,Criterion[])
	 */
	public Criteria createCriteria(String orderBy, boolean isAsc,
			Criterion... criterions) {
		return createCriteria(getEntityClass(), orderBy, isAsc, criterions);
	}

	/**
	 * <p>
	 * ����������������ֵ��ѯ����.
	 * </p>
	 * 
	 * @return ���������Ķ����б�
	 * @see HibernateGenericDao#findBy(Class,String,Object)
	 */
	public List<T> findBy(String propertyName, Object value) {
		return findBy(getEntityClass(), propertyName, value);
	}

	/**
	 * <p>
	 * ����������������ֵ��ѯ����,���������.
	 * </p>
	 * 
	 * @return ���������Ķ����б�
	 * @see HibernateGenericDao#findBy(Class,String,Object,String,boolean)
	 */
	public List<T> findBy(String propertyName, Object value, String orderBy,
			boolean isAsc) {
		return findBy(getEntityClass(), propertyName, value, orderBy, isAsc);
	}

	/**
	 * <p>
	 * ����������������ֵ��ѯ��������.
	 * </p>
	 * 
	 * @return ����������Ψһ���� or null
	 * @see HibernateGenericDao#findUniqueBy(Class,String,Object)
	 */
	public T findUniqueBy(String propertyName, Object value) {
		return findUniqueBy(getEntityClass(), propertyName, value);
	}

	/**
	 * <p>
	 * �ж϶���ĳЩ���Ե�ֵ�����ݿ���Ψһ.
	 * </p>
	 * 
	 * @param uniquePropertyNames
	 *            ��POJO�ﲻ���ظ��������б�,�Զ��ŷָ� ��"name,loginid,password"
	 * @see HibernateGenericDao#isUnique(Class,Object,String)
	 */
	public boolean isUnique(Object entity, String uniquePropertyNames) {

		return isUnique(getEntityClass(), entity, uniquePropertyNames);
	}

	/**
	 * <p>
	 * ��ü�¼����
	 * </p>
	 * 
	 * @param criterions
	 * @return
	 */
	public Long getResultCount(Criterion... criterions) {
		Criteria criteria = createCriteria(getEntityClass(), criterions);
		return getResultCount(criteria);
	}

}
