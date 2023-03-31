package com.Natalia.demo.payloads;

import java.sql.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.swing.table.*;

@EntityScan
@Table(name = "Courses")
public class CoursesPayload {
    long id;
    private String title;
    private String description;
    private String image;
    private Date date;

    

      public CoursesPayload(long id, String title, String description, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.date = date;
    }

    public CoursesPayload(){

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

}
