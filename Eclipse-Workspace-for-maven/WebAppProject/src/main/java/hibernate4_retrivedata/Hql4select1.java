package hibernate4_retrivedata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Hql4select1 {
	public static <E, R> void main(String[] args) {
        // Create configuration and add class
        Configuration cf = new Configuration();
        cf.configure("hibernet_cfg.xml");
        cf.addAnnotatedClass(Employee.class);
        
        // Create session factory
        SessionFactory sf = cf.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        
        String hql = "from Employee where salary>30000";
        Query<R> query = session.createQuery(hql);
        
        Employee employee = (Employee) query.setMaxResults(1).uniqueResult();
        
        System.out.println(employee);
        
        session.getTransaction().commit();
        session.close();
        
	}
}
