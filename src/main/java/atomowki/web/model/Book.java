package atomowki.web.model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Size(max = 15)
    private String ISBN;

    @Size(max = 50)
    @Column(nullable = false)
    private String Title;

    @Size(max = 30)
    @Column(nullable = false)
    private String Author;

    @Size(max = 100)
    @Column(nullable = false)
    private String Description;


    @Column(nullable = false)
    private Date PublishDate;

    public Long getId() {
        return id;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getDescription() {
        return Description;
    }

    public Date getPublishDate() {
        return PublishDate;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.Title = Title;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public void setPublishDate(Date publishDate) {
        this.PublishDate = publishDate;
    }
}
