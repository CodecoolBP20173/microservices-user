package com.codecool.shitwish.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserModel {

    @Id
    @GeneratedValue
    private Integer usrID;
    private String firstName;
    private String lastName;
    private String hashedPassword;

//    @Column(unique = true)
    private String email;

    private String phoneNumber;
    private String country;
    private String city;
    private String zipCode;
    private String street;
    private String profilePicture;


    public UserModel() {
    }

//    public UserModel(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }


    public UserModel(String firstName, String lastName, String hashedPassword, String email, String phoneNumber, String country, String city, String zipCode, String street, String profilePicture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hashedPassword = hashedPassword;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.profilePicture = profilePicture;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public Integer getUsrID() {
        return usrID;
    }

    public void setUsrID(Integer usrID) {
        this.usrID = usrID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
