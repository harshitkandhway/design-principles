package org.hklearning.creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{

    private String firstName;
    private String lastName;
    private String address;
    private String age;
    private UserWebDTO dto;
    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = STR."\{address.getHouseNumber()} ,\{address.getStreet()}\n\{address.getCity()} ,\{address.getState()}\n\{address.getZipcode()}";
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDate(LocalDate birthDate) {
        Period overallAge = Period.between(birthDate,LocalDate.now());
        this.age= Integer.toString(overallAge.getYears());
        return this;
    }

    @Override
    public UserWebDTO build(){
        dto = new UserWebDTO(STR."\{firstName} \{lastName}",address,age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
