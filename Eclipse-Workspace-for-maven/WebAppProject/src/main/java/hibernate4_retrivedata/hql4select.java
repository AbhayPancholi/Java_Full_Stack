package hibernate4_retrivedata;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class hql4select {
    public static <E> void main(String[] args) {
        // Create configuration and add class
        Configuration cf = new Configuration();
        cf.configure("hibernet_cfg.xml");
        cf.addAnnotatedClass(Employee.class);
        
        // Create session factory
        SessionFactory sf = cf.buildSessionFactory();
        Session session = sf.openSession();
        
        Query query = session.createQuery("from Employee");
        query.setFirstResult(0);
        query.setMaxResults(3);
        session.beginTransaction();
        
        List<E> results = query.list();
        
        for (int i=0; i<results.size(); i++) {
//        	System.out.println("Traversing the list");
        	System.out.println(results.get(i));
        }
        
        session.getTransaction().commit();
        session.close();
    }
}
