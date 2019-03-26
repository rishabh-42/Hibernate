package answer17;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//answer14
@Entity
public class Book17 {
    public Book17(){

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
    @ManyToMany(mappedBy = "book17")
    List<Author17> author17=new ArrayList<>();

    public List<Author17> getAuthor17() {
        return author17;
    }

    public void setAuthor17(List<Author17> author17) {
        this.author17 = author17;
    }

    public Book17(String bookName) {
        this.bookName = bookName;
    }
}
