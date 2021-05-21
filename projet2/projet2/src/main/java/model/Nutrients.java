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
public class Nutrients {

    private int idNutrient;
    private String food;
    private float glycemicIndex;

    public Nutrients(int idNutrient, String food, float glycemicIndex) {
        this.idNutrient = idNutrient;
        this.food = food;
        this.glycemicIndex = glycemicIndex;
    }

    public int getId() {
        return idNutrient;
    }

    public String getFood() {
        return food;
    }

    public float getGlycemicIndex() {
        return glycemicIndex;
    }

  
    public void setId(int idNutrient) {
        this.idNutrient = idNutrient;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setGlycemicIndex(float glycemicIndex) {
        this.glycemicIndex = glycemicIndex;
    }

    
    @Override
    public String toString(){
        return "[" + idNutrient + "] " + food + " " + glycemicIndex ;
    }
    
    
}
