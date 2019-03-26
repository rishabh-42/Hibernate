package answer1TO9;

import answer10to15.Adress;
import answer10to15.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        Author author = new Author();
        author.setAge(21);
        author.setFirstName("Rishabh");
        author.setLastName("Rajput");

        Author author1 = new Author("Arpit", "Gupta", 24, new Date(1997 - 1900, 9, 2));
        Author author2 = new Author("gagan", "Kushwaha", 23, new Date(1993 - 1900, 9, 3));
        Author author3 = new Author("Vagish", "Singh", 22, new Date(1992 - 1900, 9, 23));
        Author author4 = new Author("Rishabh", "Singh", 21, new Date(1997 - 1900, 9, 23));
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //answer15
        Book book =new Book();


        //Answer2
        //create
        session.save(author);
        Author author5 = session.get(Author.class, 1);
        //update
        author5.setFirstName("RISHABH");
        session.update(author5);
        //Read
        System.out.println("Reading : " + author5.getFirstName());
        //Delete
        session.delete(author5);
        //for answer 4
        session.save(author1);
        session.save(author2);
        session.save(author3);
        session.save(author4);


        // for answer 11
        Adress adress = new Adress();
        adress.setLocation("Noida");
        adress.setStreetNumber("1");
        adress.setState("UP");
        Author authorWithAdress = new Author("Rishabh", "Singh", 21, new Date(1997 - 1900, 9, 23));
        authorWithAdress.setAdress(adress);
        session.save(authorWithAdress);

        //answer 13
        author1.books.add("hindi");
        author1.books.add(("English"));
        author1.books.add("Science");

        session.persist(author1);

        author2.books.add("hindi");
        author2.books.add(("English"));
        author2.books.add("Science");

        session.persist(author2);

        //impplementing 15
        book.setId(1);
        book.setBookName("LiteratureBook");

        session.save(book);

        Author authorWithBook = session.get(Author.class, 3);
        authorWithBook.setBook(book);
        session.persist(authorWithBook);

        System.out.println("Name of the book is : " +authorWithBook.book.getBookName());







        session.getTransaction().commit();
        session.close();
    }
}
