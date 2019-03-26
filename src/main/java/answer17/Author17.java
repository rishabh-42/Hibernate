package answer17;


import answer10to15.Adress;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


//Answer1
@Entity

public class Author17 {

    @Id
    // used auto in 1 to 8  question
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//            @GeneratedValue(strategy = GenerationType.TABLE)
            int id;


    //answer 6, renaming column
    @Column(name = "first_name")
    private String firstName;

    //answer 7
    @Transient
    @Column(name = "lastname")
    private String lastName;

    @Column(name = "age")
    private int age;


    //answer 8
    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private java.util.Date dateOfBirth;

    //Answer11
    @Embedded
    Adress adress;


    //answer 16 C
    @ManyToMany
    List<Book17> book17 = new ArrayList<>();

    public Author17(String firstName, String lastName, int age, java.util.Date dateOfBirth, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Author17(String firstName, String lastName, int age, Date dateOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Author17(String rishabh, String rajput, int age, java.util.Date dateOfBirth, String noida) {

    }

    public void setDateOfBirth(java.util.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
