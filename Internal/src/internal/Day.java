/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal;

import java.util.Arrays;

/**
 *
 * @author micha
 */
public class Day extends Object implements java.io.Serializable{
    private String name="";
    private Meal[] meals = new Meal[0] ;
    private ExcercisePlan[] excercises = new ExcercisePlan[0];
    private short energy=0 ;
    private float protein=0;
    private float carbohydrates=0;
    private float sugars=0;
    private float fat=0 ;
    private short quantity=0;
    private short energyBalance=0;
    private short caloriesBurnt=0;
    private short timeSpent=0;
    public Day() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public Meal[] getMeals() {
        return meals;
    }

    public void setMeals(Meal[] meals) {
        energy=0;
        protein=0;
        carbohydrates=0;
        sugars=0;
        fat=0;
        quantity=0;
        energyBalance=0;
        this.meals = meals;
       for(int i=0; i<meals.length ; i++){
         energy+=meals[i].getEnergy();
         protein+=meals[i].getProtein();
         carbohydrates+=meals[i].getCarbohydrates();
         sugars+=meals[i].getSugars();
         fat+=meals[i].getFat();
         quantity+=meals[i].getQuantity();
        }
         energyBalance=(short) (energy-caloriesBurnt);
    }

    public ExcercisePlan[] getExcercises() {
        return excercises;
    }
 
    public void setExcercisePlans(ExcercisePlan[] excercises) {
        timeSpent=0;
        caloriesBurnt=0;
        this.excercises = excercises;
        for(int i=0 ; i<excercises.length ; i++){
        timeSpent+=excercises[i].getTimeSpent();
        caloriesBurnt+=excercises[i].getBurnt();
        }
          energyBalance=(short) (energy-caloriesBurnt);
    }
    public void addMeal(Meal m) {
     Meal[] temp= Arrays.copyOf(meals,meals.length+1);
     temp[temp.length-1]=m;
     meals=temp;
         energy+=m.getEnergy();
         protein+=m.getProtein();
         carbohydrates+=m.getCarbohydrates();
         sugars+=m.getSugars();
         fat+=m.getFat();
         quantity+=m.getQuantity();
         energyBalance=(short) (energy-caloriesBurnt);
    }
    public void addExcercisePlan(ExcercisePlan e ){
    ExcercisePlan[] temp= Arrays.copyOf(excercises, excercises.length+1);
    temp[temp.length-1]=e;
     excercises=temp;
     timeSpent+=e.getTimeSpent();
     caloriesBurnt+=e.getBurnt();
     energyBalance=(short)(energy-caloriesBurnt);
    }
    public void removeMeal(Meal m){
    for(int i=0; i<meals.length ; i++){
    if(meals[i].equals(m)){
    meals[i]=meals[meals.length-1];
    meals[meals.length-1]=null;
    meals=Arrays.copyOf(meals, meals.length-1);
    }
    setMeals(meals);
        
     }
    }
   
    
    
    public void removeExcercisePlan(ExcercisePlan e){
    for(int i=0; i<excercises.length ; i++){
    if(excercises[i].equals(e)){
    excercises[i]=excercises[excercises.length-1];
    excercises[excercises.length-1]=null;
    excercises=Arrays.copyOf(excercises, excercises.length-1);
    }
    }
    System.out.println(excercises.length);
    setExcercisePlans(excercises);
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

    public short getEnergyBalance() {
        return energyBalance;
    }

    public short getCaloriesBurnt() {
        return caloriesBurnt;
    }

    public short getTimeSpent() {
        return timeSpent;
    }

    @Override
    public String toString() {
        return  name;
    }
    public void recalculate(){
    setExcercisePlans(this.excercises);
    }
}
