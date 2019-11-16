package com.pankmri.korim.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 * @Project user-activity
 * @Author mgohain
 * @Created 2019-11-12
 **/
@Entity
@Table(name = "t_user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    @NotEmpty(message = "Please provide your username")
    private String userName;

    @Column(name = "first_name")
    @NotEmpty(message = "Please provide your first name")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "Please provide your last name")
    private String lastName;

    @Column(name = "contact_no")
    @Length(min = 10, message = "Your contact number must have at least 10 characters")
    @Length(max = 13, message = "Your contact number can have at max 13 characters")
    @NotEmpty(message = "Please provide your contact number")
    private String contactNumber;

    @Column(name = "email")
    @NotEmpty(message = "Please provide your email address")
    private String email;


    @Column(name = "password")
    @Length(min = 8, message = "Your password must have at least 8 characters")
    @Length(max = 20, message = "Your password can have at max 20 characters")
    @NotEmpty(message = "Please provide your contact number")
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
