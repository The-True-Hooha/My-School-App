package com.TheTrueHooha.MySchool.entity;

import javax.persistence.*;

@Entity
@Table (name = "students")
public class Student {

    //primary key for the table annotation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //defines the properties in the student entity
    private Long regNo;

    //@column maps the column annotation for the fields in the database
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "Dob")
    private String dob;

    @Column(name = "homeAddress")
    private String homeAddress;

    //a default constructor for the parameter constructor
    public Student () {

    }

    //parameter constructor for the  entities
    public Student(String firstName, String lastName, String email, String gender, String dob, String homeAddress) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.homeAddress = homeAddress;
    }

    //getter methods for the entity
    public Long getRegNo() {
        return regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    //setter methods for the entity
    public void setRegNo(Long regNo) {
        this.regNo = regNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

}
