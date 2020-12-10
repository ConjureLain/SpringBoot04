package com.Han.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Han.pojo.Department;
import com.Han.pojo.Employee;

@Repository
public class EmployeeDAO {
	//模拟数据库
		private static Map<Integer, Employee> empmap = null;
		
		@Autowired
		private DepartmentDAO departmentDAO;
		
		static {
			empmap = new HashMap<Integer, Employee>();
			
			empmap.put(1001, new Employee(1001,"AA","123456@gmail.com",true,new Department(101,"教学部") ));
			empmap.put(1002, new Employee(1002,"BB","123456@gmail.com",true,new Department(102,"市场部") ));
			empmap.put(1003, new Employee(1003,"CC","123456@gmail.com",true,new Department(103,"调研部") ));
			empmap.put(1004, new Employee(1004,"DD","123456@gmail.com",true,new Department(104,"运营部") ));
			empmap.put(1005, new Employee(1005,"EE","123456@gmail.com",true,new Department(105,"后勤部") ));
		}
		
		//主键自增
		private static Integer initId = 1006;
		
		//增加一个员工
		public void save(Employee employee) {
			if(employee.getId()==null) {
				employee.setId(initId++);
			}
			
			employee.setDepartment(departmentDAO.getDepartmentById(employee.getDepartment().getId()));
			
			empmap.put(employee.getId(),employee);
		}
		
		//查询所有员工信息
		public Collection<Employee> getEmps(){
			return empmap.values();
		}
		
		//通过id查找员工
		public Employee getEmpsById(Integer id) {
			return empmap.get(id);
		}
		
		//删除员工
		public void deleteEmps(Integer id) {
			empmap.remove(id);
		}
}
