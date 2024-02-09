/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal;

import javax.swing.JOptionPane;

/**
 *
 * @author micha
 */
public class Meal implements java.io.Serializable {
    private String name="Meal";
    private Ingridient[] ingridients;
    private short energy ;
    private float protein;
    private float carbohydrates;
    private float sugars;
    private float fat ;
    private short quantity;

    public Meal(Ingridient[] ingridients) {
        this.ingridients = ingridients;
        for(int i=0 ; i<ingridients.length ; i++){
        energy+=(this.ingridients[i].getEnergy()*(float)ingridients[i].getQuantity())/100;
        protein+=(this.ingridients[i].getProtein()*(float)ingridients[i].getQuantity())/100;
        carbohydrates+=(this.ingridients[i].getCarbohydrates()*(float)ingridients[i].getQuantity())/100;
        sugars+=(this.ingridients[i].getSugars()*(float)ingridients[i].getQuantity())/100;
        fat+=(this.ingridients[i].getFat()*(float)ingridients[i].getQuantity())/100;
        quantity+=this.ingridients[i].getQuantity();
        }
    }

    /**
     * Get the value of ingridients
     *
     * @return the value of ingridients
     */
    public Ingridient[] getIngridients() {
        return ingridients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public short getEnergy() {
        return energy;
    }

    public float getProtein() {
        return protein;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public float getSugars() {
        return sugars;
    }

    public float getFat() {
        return fat;
    }

    public short getQuantity() {
        return quantity;
    }
    public void displayInformation(){
    JOptionPane.showMessageDialog(null,"Energy: "+ energy + "\n" + "Protein: "+ protein + "\n" + "Carbohydrates: "+ carbohydrates + "\n" + "Sugars: "+ sugars + "\n" + "Fat: "+ fat, "Nutritional information", JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * Set the value of ingridients
     *
     * @param ingridients new value of ingridients
     */
    public void setIngridients(Ingridient[] ingridients) {
        this.ingridients = ingridients;
    }

    @Override
    public String toString() {
        return   name + " "+ quantity+"g" ;
    }

   

}
