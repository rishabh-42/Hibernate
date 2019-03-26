package answer16;

import javax.persistence.*;

//answer14
@Entity
public class Book16 {
    public Book16(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    String bookName;

    //answer 16 B
    @ManyToOne
    Author16 author16;

    public Author16 getAuthor16() {
        return author16;
    }

    public void setAuthor16(Author16 author16) {
        this.author16 = author16;
    }

    public Book16(String bookName) {
        this.bookName = bookName;
    }
}
