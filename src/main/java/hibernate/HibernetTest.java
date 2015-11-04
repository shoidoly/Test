package hibernate;

import hibernate.bean.Employee;
import hibernate.dao.EmployeeDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("HibernatTestContext.xml");
		
		EmployeeDao employeeDao = (EmployeeDao)context.getBean("employeeDao");
		Employee employee1 = new Employee();
//		employee1.setId(1);
		employee1.setName("Ryan Song");
		employee1.setPhoneNumber("214-123-7389");
		
		employeeDao.addEmployee(employee1);
		System.out.println(employeeDao.getById(2));
		
		
		

	}

}
