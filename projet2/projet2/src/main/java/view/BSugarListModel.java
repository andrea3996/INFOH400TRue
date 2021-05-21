/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import model.BloodSugar;


/**
 *
 * @author margauxmannaerts
 */
public class BSugarListModel extends AbstractListModel{
    ArrayList<BloodSugar> bloodSugar;
            
    public BSugarListModel(ArrayList<BloodSugar> bloodSugars){
        this.bloodSugar = bloodSugars;
    }
            
    @Override
    public int getSize() {
        return bloodSugar.size();
    }

    @Override
    public Object getElementAt(int index) {
        return bloodSugar.get(index);
    }
}
