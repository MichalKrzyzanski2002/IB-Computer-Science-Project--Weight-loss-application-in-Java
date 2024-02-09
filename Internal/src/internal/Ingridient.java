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
public class Ingridient implements java.io.Serializable {
    private String name ;
    private short energy ;
    private float protein;
    private float carbohydrates;
    private float sugars;
    private float fat ;
    // per 100g
    private short quantity;

    public Ingridient() {
    }

    public Ingridient(String name, short energy, float protein, float carbohydrates, float sugars, float fat, short index) {
        this.name = name;
        this.energy = energy;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.sugars = sugars;
        this.fat = fat;
       
    }
    public Ingridient(Ingridient ing){
        this.name = ing.name;
        this.energy = ing.energy;
        this.protein = ing.protein;
        this.carbohydrates = ing.carbohydrates;
        this.sugars = ing.sugars;
        this.fat = ing.fat;
    }

 
    public void setName(String name) {
        this.name = name;
    }

    
    public void setEnergy(short energy) {
        this.energy = energy;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setSugars(float sugars) {
        this.sugars = sugars;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

  
    
    public void setQuantity(short quantity){
    this.quantity = quantity ;
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

      public String getName() {
        return name;
    }
      
      public short getQuantity(){
      return quantity;
      }
 public void displayInformation(){
    JOptionPane.showMessageDialog(null,"Nutrients per 100g in grams" + "\n" + "Energy: "+ energy + "\n" + "Protein: "+ protein + "\n" + "Carbohydrates: "+ carbohydrates + "\n" + "Sugars: "+ sugars + "\n" + "Fat: "+ fat, "Nutritional information", JOptionPane.INFORMATION_MESSAGE );
    }
      
  

    @Override
    public String toString() {
        if(quantity!=0){
        return name+" "+quantity+"g" ;
        } 
        else{
        }  return name;
    }
      
   
    
    
}

