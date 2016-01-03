package hibernate.dao;

import hibernate.bean.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	
	public Employee getById(int id);
	
	public void deleteEmployee(Employee employee);
	
}
