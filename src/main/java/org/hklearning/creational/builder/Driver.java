package org.hklearning.creational.builder;

import java.time.LocalDate;
import java.time.Period;

import static org.hklearning.creational.builder.HelperUtility.getSampleAddress;
import static org.hklearning.creational.builder.HelperUtility.getSampleUser;

public class Driver {
    public static void main(String[] args) {
        //When we have constructor defined in the UserWebDTO class to set the values.
        //builderPattern1();

        //When we have immutable object creation for the UserDTO, since the parameterized constructor is not present and the setter methods are defined as private.
        //builderPattern2();
    }

    private static void builderPattern2() {
        UserDTO2 dto = new UserDTO2.UserDTO2Builder()
                .withFirstName(getSampleUser().getFirstName())
                .withLastName(getSampleUser().getLastName())
                .withBirthday(getSampleUser().getBirthdate())
                .withAddress(getSampleAddress()).build();
        System.out.println(dto);
    }

    private static void builderPattern1() {
        //When we have to create an object just by using parameterized constructors with complex parameters or multiple parameters it gets challenging.
        //In all such cases using a builder creational design pattern will be helpful.
        User user = getSampleUser();
        Address address = getSampleAddress();
        UserWebDTO webDTO = new UserWebDTO(STR."\{user.getFirstName()} \{user.getLastName()}",
                STR."\{address.getHouseNumber()} \{address.getStreet()} \{address.getCity()} \{address.getState()} \{address.getZipcode()}",
                String.valueOf(Period.between(user.getBirthdate(), LocalDate.now()).getYears()));
        System.out.println(webDTO);

        //This is the director class where we will create the object of the required WebDTO class using the method chaining method from the builder pattern.
        UserDTO webDTO1 = new UserWebDTOBuilder()
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthDate(user.getBirthdate())
                .withAddress(address).build();
        System.out.println(webDTO1);
    }

}
