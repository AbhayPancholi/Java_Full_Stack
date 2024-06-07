package hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store {

public static void main(String[] args) {

Configuration cf = new Configuration(); 
cf.configure("hibernet_cfg.xml"); 
cf.addAnnotatedClass(Employee.class); 
cf.addAnnotatedClass(Address.class);

//step 2 creating session factory 
SessionFactory sf = cf.buildSessionFactory(); 
Session session = sf.openSession();

Transaction t = session.beginTransaction();

Employee e1 = new Employee(); 
e1.setName("Abhay");

e1.setEmail("Abhay@gmail.com");

Address address1 = new Address();

address1.setAddressLine1("sz-lock flats");

address1.setCity("Akola");

address1.setState("Chennai"); 
address1.setCountry("India");

address1.setPincode(612303);

e1.setAddress(address1); 
session.save(address1);

session.persist(e1);
t.commit();

session.close();

System.out.println("Emp with address stored in tow tables");
}}