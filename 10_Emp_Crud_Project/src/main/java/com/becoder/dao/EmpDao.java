package com.becoder.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.becoder.entity.Emp;

@Service
public interface EmpDao {
	
	public int saveEmp(Emp emp);
	
	public Emp getEmpById(int id);
	
	public List<Emp> getAllEmp();
	
	public void update(Emp emp);
	
	public void deleteEmp(int id);
	
	
	

}
