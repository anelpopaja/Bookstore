package local.rps.bookstore.model;


import com.mongodb.*;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Author {

    public static ArrayList<Author> authorArrayList = new ArrayList<>();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    public Author() {
    }
    public Author(String name){
        this.name = name;
        Author.authorArrayList.add(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
