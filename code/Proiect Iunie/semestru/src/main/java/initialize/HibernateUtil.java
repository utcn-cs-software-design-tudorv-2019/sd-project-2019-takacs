package initialize;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.fasterxml.classmate.AnnotationConfiguration;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder ;
//import org.hibernate.service.ServiceRegistryBuilder;
 
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	 
	private static SessionFactory buildSessionFactory() {
	      
	    Configuration configuration = new Configuration();
	    configuration.configure();
configuration.addAnnotatedClass(model.Site.class);
	    System.out.println("Hibernate Annotation Configuration loaded");
	             
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	      .applySettings(configuration.getProperties()).build();
	    System.out.println("Hibernate Annotation serviceRegistry created");
	             
	    SessionFactory sessionFactory 
	      = configuration.buildSessionFactory(serviceRegistry);
	             
	    return sessionFactory;
	}   
	 
	public static  SessionFactory getSessionFactory() {
	    if(sessionFactory == null) sessionFactory = buildSessionFactory();
	    return sessionFactory;
	}   
}