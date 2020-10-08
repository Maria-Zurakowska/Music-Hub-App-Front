package com.musichubappfront.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;
    private String gender;
    private String city;
    private String country;

    public UserDto(int id, String firstName, String lastName, String email, String password, int age, String gender, String city, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
