package hibernate.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import hibernate.bean.Employee;
import hibernate.dao.EmployeeDao;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao  {
	
	HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	
	public void addEmployee(Employee employee) {
		template.save(employee);
	}
	
	public Employee getById(int id){
		Employee employee = (Employee)template.get(Employee.class, id);
		return employee;
	}
	
}
