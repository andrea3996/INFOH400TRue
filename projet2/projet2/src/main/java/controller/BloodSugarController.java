/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BloodSugar;
import javax.persistence.Query;
import view.test1;

/**
 *
 * @author margauxmannaerts
 */
public class BloodSugarController {

    public void create(BloodSugar bloodsugar) {
        
    }

    public ArrayList<BloodSugar> getBloodSugars(){
        try {
            
            Connection conn = DBHandler.getConnection(); //we connect to the DB then we do the necessary query
            ArrayList<BloodSugar> bloodSugarList = new ArrayList();
            PreparedStatement s = conn.prepareStatement("SELECT idBSugar, bloodSugar, registerDateTime, idPatient FROM bloodSugar;");
            
            ResultSet rs = s.executeQuery();
            while (rs.next()) {
                int idBSugar = rs.getInt("idBSugar");
                float bloodSugar = rs.getFloat("bloodSugar");
                String registerDateTime = rs.getString("registerDateTime");
                int idPatient = rs.getInt("idPatient");
                bloodSugarList.add(new BloodSugar(idBSugar, bloodSugar, registerDateTime, idPatient));
                /*"[" + id + "] " + firstName + " " + lastName.toUpperCase() + "(" + dateOfBirth + ")"*/
            }
            
            rs.close();
            s.close();
            
            return bloodSugarList;
        } catch (SQLException ex) {
            Logger.getLogger(test1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
