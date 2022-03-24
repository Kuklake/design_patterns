package pl.sda.java.designPatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {
    @Test
    void shouldCreateUserOnlyWithFirstNameAndLastName() {

        String firstName = "Nela";
        String lastName = "Kuklake";
        User user = new User.UserBuilder(firstName, lastName)
                .build();

        System.out.println(user);

        assertTrue(user.getFirstName().equals(firstName));
        assertEquals(lastName, user.getLastName());

        assertEquals(0, user.getAge());
        assertEquals(null, user.getPhone());
        assertEquals(null, user.getAddress());
    }

    @Test
    void shouldCreateUserWithAllProperties() {
        String firstName = "Nela";
        String lastName = "Kuklake";
        int age = 45;
        String address = "klonowa 6";
        String phone = "666";

        User user = new User.UserBuilder(firstName, lastName)
                .age(age)
                .address(address)
                .phone(phone)
                .build();

        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(age, user.getAge());
        assertEquals(address, user.getAddress());
        assertEquals(phone, user.getPhone());
    }
}