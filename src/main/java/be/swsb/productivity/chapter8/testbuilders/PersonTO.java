package be.swsb.productivity.chapter8.testbuilders;

import java.util.Date;

public class PersonTO {

    private String firstName;
    private String lastName;

    private Date birthDate;

    private String street;
    private String zipCode;
    private String country;
    private String phone;

    private int points;

    public PersonTO(String firstName, String lastName, Date birthDate, String street, String zipCode, String country, String phone, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.street = street;
        this.zipCode = zipCode;
        this.country = country;
        this.phone = phone;
        this.points = points;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public int getPoints() {
        return points;
    }
}
