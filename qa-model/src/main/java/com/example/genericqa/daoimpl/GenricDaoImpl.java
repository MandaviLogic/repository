package com.example.genericqa.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.genericqa.dao.GenericDao;

@Repository
@Scope( BeanDefinition.SCOPE_PROTOTYPE )
public class GenricDaoImpl implements GenericDao{

	@PersistenceContext
	private EntityManager em;
	
	
	public boolean save(Object entity) {
		try {
			em.persist(entity); 
	}
	catch(Exception e){
		e.printStackTrace();
		return false;
	}
	return true;
	}

	@Transactional
	public <T> T find(Class<T> type, long id) {
		T value=(T)em.find(type, id);
		if(value==null) {
			return null;
		}
		return em.find(type, id);
	}

	@SuppressWarnings("unchecked")
	public <T> Page<T> findAll(Class<T> type, long id) {
		return (Page<T>) em.createQuery("select _it_ from " + type.getName() + " _it_").getResultList();
	}

	public boolean remove(Object entity) {
		
		return false;
	}

	@Override
	public <T> Object findById(Class<T> type, long id) {
		// TODO Auto-generated method stub
		return null;
	}
       
}
