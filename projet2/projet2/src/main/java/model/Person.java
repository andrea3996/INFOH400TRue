/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author margauxmannaerts
 */
public class Person {
    
    private int idPerson;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String username;
    private String password;

    public Person(int idPerson, String firstName, String lastName, String dateOfBirth, String username, String password) {
        this.idPerson = idPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setId(int idPerson) {
        this.idPerson = idPerson;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String dateOfBirth) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return "[" + idPerson + "] " + firstName + " " + lastName.toUpperCase() + "(" + dateOfBirth + ")";
    }
    
    
}
