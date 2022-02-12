package com.TheTrueHooha.MySchool.entity;

public class Student {

    //defines the properties in the student entity
    private Long regNo;
    private String firstName;
    private String lastNmae;
    private String email;
    private String gender;
    private String dob;
    private String homeAddress;


    //getter methods for the entity
    public Long getRegNo() {
        return regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNmae() {
        return lastNmae;
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

    public void setLastNmae(String lastNmae) {
        this.lastNmae = lastNmae;
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
