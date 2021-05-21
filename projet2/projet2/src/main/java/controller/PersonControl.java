/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.test1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Person;
/**
 *
 * @author margauxmannaerts
 */
public class PersonControl {
    
    public ArrayList<Person> getPersons(){
        try {
            
            Connection conn = DBHandler.getConnection(); //we connect to the DB then we do the necessary query
            ArrayList<Person> patientList = new ArrayList();
            PreparedStatement s = conn.prepareStatement("SELECT idPerson, firstName, lastName, dateOfBirth, username, password FROM person;");
            
            ResultSet rs = s.executeQuery();
            while (rs.next()) {
                int idPerson = rs.getInt("idPerson");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String dateOfBirth = rs.getString("dateOfBirth");
                String username = rs.getString("username");
                String password = rs.getString("password");
                
                patientList.add(new Person(idPerson, firstName, lastName, dateOfBirth, username, password));
                /*"[" + id + "] " + firstName + " " + lastName.toUpperCase() + "(" + dateOfBirth + ")"*/
            }
            
            rs.close();
            s.close();
            
            return patientList;
        } catch (SQLException ex) {
            Logger.getLogger(test1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
