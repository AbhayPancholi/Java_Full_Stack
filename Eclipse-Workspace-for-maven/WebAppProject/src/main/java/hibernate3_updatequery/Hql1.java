package hibernate3_updatequery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Hql1 {
    public static void main(String[] args) {
        // Create configuration and add class
        Configuration cf = new Configuration();
        cf.configure("hibernet_cfg.xml");
        cf.addAnnotatedClass(Employee.class);
        
        // Create session factory
        SessionFactory sf = cf.buildSessionFactory();
        Session session = sf.openSession();
        
        // Correct HQL query
        Query<?> query = session.createQuery("update Employee set Salary=:salary where name=:name");
        query.setParameter("salary", 3600000);
        query.setParameter("name", "csmss");
        
        session.beginTransaction();
        int modifications = query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        
        System.out.println("Number of modifications: " + modifications);
    }
}
