package com.minierp.minierp.model;


import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
@Component
@Scope("prototype")
public class Person {
    private int personid;
    private String title;
    private String firstname;
    private String lastname;
    private String gender;
    private LocalDate dateofbirth;

    private LocalDate datecreated;
    private int createdby;
    private LocalDate lastupdateddate;
    private int lastupdatedby;

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public LocalDate getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(LocalDate datecreated) {
        this.datecreated = datecreated;
    }

    public int getCreatedby() {
        return createdby;
    }

    public void setCreatedby(int createdby) {
        this.createdby = createdby;
    }

    public LocalDate getLastupdateddate() {
        return lastupdateddate;
    }

    public void setLastupdateddate(LocalDate lastupdateddate) {
        this.lastupdateddate = lastupdateddate;
    }

    public int getLastupdatedby() {
        return lastupdatedby;
    }

    public void setLastupdatedby(int lastupdatedby) {
        this.lastupdatedby = lastupdatedby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personid=" + personid +
                ", title='" + title + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateofbirth=" + dateofbirth +
                ", datecreated=" + datecreated +
                ", createdby=" + createdby +
                ", lastupdateddate=" + lastupdateddate +
                ", lastupdatedby=" + lastupdatedby +
                '}';
    }
}
