package org.hklearning.creational.builder2;

import org.hklearning.creational.builder.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserDTO2 {
    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO2{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static class UserDTO2Builder {
        private String firstName;
        private String lastName;
        private String address;
        private String age;
        private UserDTO2 dto;

        public UserDTO2Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTO2Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTO2Builder withAddress(Address address) {
            this.address = address.getHouseNumber() + " ," + address.getStreet() + " \n" +
                    address.getCity() + " " + address.getState() + " \n" + address.getZipcode();
            return this;
        }

        public UserDTO2Builder withBirthday(LocalDate birthdate) {
            int age = Period.between(birthdate, LocalDate.now()).getYears();
            this.age = Integer.toString(age);
            return this;
        }

        public UserDTO2 build() {
            UserDTO2 dto = new UserDTO2();
            dto.setName(firstName + " " + lastName);
            dto.setAge(age);
            dto.setAddress(address);
            return dto;
        }
    }
}
