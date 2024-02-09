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
public class ExcercisePlan implements java.io.Serializable {
    
    private String name;
    private short burnt=0;
    private Excercise[] excercises;
    private Person user ;
    private short timeSpent=0;
    public ExcercisePlan(Excercise[] exc, Person user) {
        this.excercises = exc;
        for (Excercise exc1 : exc) {
            burnt += ((float) (exc1.getEnergy() * exc1.getTime() * user.getWeight())) / 60;
            timeSpent += exc1.getTime();
        }
    }

    public short getBurnt() {
        return burnt;
    }

    public short getTimeSpent() {
        return timeSpent;
    }

    public Person getUser() {
        return user;
    }
    public void updateUser(Person user){
    this.user=user;
    burnt=0;
    timeSpent=0;
        for (Excercise exc1 : excercises) {
            burnt += ((float) (exc1.getEnergy() * exc1.getTime() * user.getWeight())) / 60;
            timeSpent += exc1.getTime();
        }
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void displayInformation(){
    JOptionPane.showMessageDialog(null,"Energy burnt: "+burnt+" kcal"+"\n"+"Duration: "+timeSpent+" minutes","Nutritional information", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public String toString() {
        return name ;
    }

}
