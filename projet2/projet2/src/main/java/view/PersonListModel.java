/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import model.Person;

/**
 *
 * @author margauxmannaerts
 */
public class PersonListModel extends AbstractListModel{

    ArrayList<Person> person;
            
    public PersonListModel(ArrayList<Person> persons){
        this.person = persons;
    }
            
    @Override
    public int getSize() {
        return person.size();
    }

    @Override
    public Object getElementAt(int index) {
        return person.get(index);
    }
    
}
