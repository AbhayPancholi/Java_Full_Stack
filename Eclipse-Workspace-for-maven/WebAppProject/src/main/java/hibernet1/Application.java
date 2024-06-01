package hibernet1;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Application {
	
	public static void main(String[] ar) {
		//System.out.println("Hello hiber1");
		//1. create configuration and class
		
		Configuration cf = new Configuration();
		
		cf.configure("hibernet_cfg.xml");
		cf.addAnnotatedClass(Employee.class);
		
		//step 2 creating session factory
		SessionFactory sf = cf.buildSessionFactory();
		
		//Step3 Creating session object
		Session s1 = sf.openSession();
		
		Employee e1 = new Employee();
		e1.setId(6);
		e1.setName("csmss");
		e1.setSalary(200000);
		s1.beginTransaction();
		s1.save(e1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("Ojbect saved in db");
	}

}
