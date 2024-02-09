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
public class Excercise implements java.io.Serializable {
    
    private float met;
    private String name;
    
    private short timeSpent;

    /**
     * Get the value of time
     *
     * @return the value of time
     */
    public short getTime() {
        return timeSpent;
    }

    /**
     * Set the value of time
     *
     * @param time new value of time
     */
    public void setTime(short time) {
        this.timeSpent = time;
    }

    Excercise() {
    }
    
    Excercise(Excercise exc){
    this.met=exc.met;
    this.name=exc.name;
    this.timeSpent=exc.timeSpent;
     
    }

    /**
     * Get the value of Energy
     *
     * @return the value of Energy
     */
    public float getEnergy() {
        return met;
    }

    /**
     * Set the value of Energy
     *
     */
    public void setEnergy(float energy) {
        this.met = energy;
    }


    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.name = Name;
    }

    public void displayInformation(){
    JOptionPane.showMessageDialog(null, "Time: "+timeSpent+" minutes"+ "\n"+ "Kcal burnt per minute: "+ met,"Excercise information", JOptionPane.INFORMATION_MESSAGE);
    }

    public Excercise(short energy, String name) {
        this.met = energy;
        this.name = name;
    }

    public Excercise(short energy, String name, short time) {
        this.met = energy;
        this.name = name;
        this.timeSpent = time;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
