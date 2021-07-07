package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="Users")
public class User {
    @Id
    private Long id;
    private String Name;
    private String LastName;
    private String address;
    private Date BirthDate;
    private Long Number;
    //agregar tabla tipos documentos
    private Long DNI;
    //agregar tabla tipo genero
    private String Gender;
    //agregar tablas
    private String Country;
    private String State;
    private String City;
    private String Description;
    //agregar foto
    private String UserName;
    private String Password;

    public User(Long id, String name, String lastName, String address, Date birthDate, Long number, Long DNI, String gender, String country, String state, String city, String description, String userName, String password) {
        this.id = id;
        Name = name;
        LastName = lastName;
        this.address = address;
        BirthDate = birthDate;
        Number = number;
        this.DNI = DNI;
        Gender = gender;
        Country = country;
        State = state;
        City = city;
        Description = description;
        UserName = userName;
        Password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Long getNumber() {
        return Number;
    }

    public void setNumber(Long number) {
        Number = number;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public User() {

    }
}
