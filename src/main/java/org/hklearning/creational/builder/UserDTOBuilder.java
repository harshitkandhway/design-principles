package org.hklearning.creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withAddress(Address address);
    UserDTOBuilder withBirthDate(LocalDate birthDate);
    UserDTO build();
    UserDTO getUserDTO();

}
