package answer17;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        Book17 book1 = new Book17("English");
        Book17 book2 = new Book17("Hindi");

        Author17 author17 = new Author17("Rishabh","Rajput",21,new Date(1997-1900,9,23),"Noida");


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // adding in bidirectional

        //commenting for cascade save

        session.save(book1);
        session.save(book2);

        author17.book17.add(book1);
        author17.book17.add(book2);

        session.persist(author17);
        session.getTransaction().commit();
        session.close();
    }
}
