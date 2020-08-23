package com.musichubappfront.gui;

public class Contact {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;

    public Contact(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public static void setFirstName(Contact contact, String s) {
    }

    public static void setLastName(Contact contact, String s) {

    }

    public static void setEmail(Contact contact, String s) {

    }

    public static void setPhone(Contact contact, String s) {
    }
}
