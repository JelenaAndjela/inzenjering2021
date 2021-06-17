package inz.social_engineering.repository;

import java.util.List;

public interface RdfRepository<T> {

	T findOne(String id);
	
	 List<T> findAll();
	
	 T save(T entity);
	
	void delete(String id);
	
	T update(T entity);
}
