/**
 * 
 */
package controller;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import javax.swing.JFrame;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import initialize.HibernateUtil;
import model.Account;
import model.Password;
import model.Site;
import model.User;
import service.PasswordService;
import service.SiteService;
import service.UserService;


/**
 * @author ingri
 *
 */
public class ControllerUser implements ActionListener{

	UserService userService;// = context.getBean(UserService.class);
	PasswordService passwordService;// = context.getBean(PasswordService.class);
	SiteService siteService;// = context.getBean(SiteService.class);

	private ViewUser view_user ;

	HibernateUtil hibernateUtil;
	public ControllerUser(ViewUser v) {
		// TODO Auto-generated constructor stub
		this.view_user = v;
		hibernateUtil = new HibernateUtil();
	}


	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object source = arg0.getSource();
		
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction t = null;
		if(source == view_user.getAddSite())
		{
			try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			System.out.println("Session Created");
			t = session.beginTransaction();
			String name = view_user.getText_textField().getText();
			Site site = new Site(name);
			Site site1 = new Site("Rasunetul");
			session.save(site1);
			t.commit();
			}catch(Exception e)
			{
				//t.rollback();
				e.printStackTrace();
			}
			finally {
				if(session!=null)
					session.close();
			}
		}
		if(source == view_user.getAddAccount())
		{
			try {
				sessionFactory = hibernateUtil.getSessionFactory();
				session = sessionFactory.getCurrentSession();
				System.out.println("Session Created");
				//String iban = view_user.getText_textField().toString();
				//Account account = new Account(iban);
				Account account1 = new Account("123123123");
				t = session.beginTransaction();
				session.save(account1);
				t.commit();
			}catch(Exception e)
			{
				//t.rollback();
				e.printStackTrace();
			}finally {
				if(session!=null) session.close();
			}
		}
		
	}

}