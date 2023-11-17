package com.example.JavaPreProjectActivity3_1_2.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "passport_number_series")
    private String passportNumberSeries;

    public User() {

    }

    public User(int id, String firstName, String lastName, String passportNumberSeries) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumberSeries = passportNumberSeries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportNumberSeries() {
        return passportNumberSeries;
    }

    public void setPassportNumberSeries(String passportNumberSeries) {
        this.passportNumberSeries = passportNumberSeries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(passportNumberSeries, user.passportNumberSeries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, passportNumberSeries);
    }
}
