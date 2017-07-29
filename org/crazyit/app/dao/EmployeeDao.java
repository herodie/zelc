package org.crazyit.app.dao;

import java.util.*;

import org.crazyit.app.domain.*;


public interface EmployeeDao
{
	
	Employee get(Integer id);

	
	Integer save(Employee employee);

	
	void update(Employee employee);

	
	void delete(Employee employee);

	
	void delete(Integer id);

	List<Employee> findAll();
	Employee findByName(String name);

	 List<Employee> findlikeNameAndPass(String name, String pass);
	List<Employee> findByNameAndPass(Employee emp);
	int findByNameAndPass(String name, String pass);
	
	
}
