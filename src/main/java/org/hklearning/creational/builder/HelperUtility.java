package org.hklearning.creational.builder;

import java.time.LocalDate;

public class HelperUtility {
    public static Address getSampleAddress(){
        return new Address("1101", "Baner", "Pune", "Maharashtra", "411045");
    }
    public static User getSampleUser(){
        return new User("Chris", "Martin", HelperUtility.getSampleAddress(), LocalDate.of(1995, 1, 1));
    }
}
