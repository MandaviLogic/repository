package com.example.genericqa.dao;

import org.springframework.data.domain.Page;


public interface GenericDao {

	public boolean save(Object entity);
	
	public <T> T find(Class<T> type, long id);
	
	public <T> Page<T> findAll(Class<T> type, long id);
	
	public boolean remove(Object entity);

	public <T> Object findById(Class<T> type ,long id);
}
