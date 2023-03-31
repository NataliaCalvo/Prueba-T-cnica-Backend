package com.Natalia.demo.payloads;

import java.sql.Date;


public class UsersPayload {
    Long id;
    private String title;
    private Date date;
    private String paymentMethod;
    private String name;
    private String company;

    public UsersPayload(){
        
    }
    
    public UsersPayload(Long id, String title, Date date, String description, String name, String company) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.paymentMethod = description;
        this.name = name;
        this.company = company;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setDescription(String description) {
        this.paymentMethod = description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Date getDate() {
        return date;
    }
    public String getDescription() {
        return paymentMethod;
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }

}
