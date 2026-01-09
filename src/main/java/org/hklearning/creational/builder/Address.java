package org.hklearning.creational.builder;

public class Address {
    private String houseNumber;
    private String street;
    private String City;
    private String state;
    private String zipcode;

    public Address(String houseNumber, String street, String city, String state, String zipcode) {
        this.houseNumber = houseNumber;
        this.street = street;
        City = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
