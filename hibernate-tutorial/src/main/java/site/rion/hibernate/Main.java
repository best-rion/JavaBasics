package site.rion.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main
{
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try
		{
			// create a student object
			Student tempStudent = new Student();
			tempStudent.setName("Rion");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student
			session.persist(tempStudent);
			
			// commit the transaction
			session.getTransaction().commit();
		}
		finally
		{
			factory.close();
		}
	}
}