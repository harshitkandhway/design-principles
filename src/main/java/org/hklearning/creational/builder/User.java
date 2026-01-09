package org.hklearning.creational.builder;

import java.time.LocalDate;

//This is the entity class which can be used for creating the DTO object.
public class User {
    private String firstName;
    private String lastName;
    private Address address;
    private LocalDate birthdate;

    public User(String firstName, String lastName, Address address, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
