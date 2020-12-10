package com.Han.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.Han.pojo.Department;

@Repository
public class DepartmentDAO {
	
	//模拟数据库
	private static Map<Integer, Department> depmap = null;
	static {
		depmap = new HashMap<Integer, Department>();
		
		depmap.put(101, new Department(101,"教学部"));
		depmap.put(102, new Department(102,"市场部"));
		depmap.put(103, new Department(103,"调研部"));
		depmap.put(104, new Department(104,"运营部"));
		depmap.put(105, new Department(105,"后勤部"));
	}
	
	//获得所有部门的信息
	public Collection<Department> getDepartments(){
		return depmap.values();
	}
	
	//通过id查找部门
	public Department getDepartmentById(Integer id) {
		return depmap.get(id);
	}
}
