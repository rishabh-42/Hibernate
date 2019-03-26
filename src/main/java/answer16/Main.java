package answer16;

import answer1TO9.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        Book16 book1 = new Book16("English");
        Book16 book2 = new Book16("Hindi");

        Author16 author16 = new Author16("Rishabh","Rajput",21,new Date(1997-1900,9,23),"Noida");


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // adding in bidirectional

        //commenting for cascade save
        book1.setAuthor16(author16);
        book2.setAuthor16(author16);

        session.save(book1);
        session.save(book2);

        author16.book16.add(book1);
        author16.book16.add(book2);

        session.persist(author16);
        session.getTransaction().commit();
        session.close();
    }
}
