package local.onlits2001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( helloWorld() );

        Student student = new Student();
        student.setId(1);
        student.setName("Mrityunjay Kumar");
    }

    public static String helloWorld() {
        return "HelloWorld";
    }

    public static String create() {

        SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student(1, "Mrityunjay Kumar");
        session.save(student);
        
        transaction.commit();
        return "Data Created!";
    }
}