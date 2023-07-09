package com.resume.model;

import javax.persistence.*;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1000)
    private String description;

    @Transient
    private MultipartFile imageFile;

    public Post() {
    }

    public Post(Long id, String title, String description, MultipartFile imageFile) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageFile = imageFile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
    // Constructors, getters, and setters
    // ...
}