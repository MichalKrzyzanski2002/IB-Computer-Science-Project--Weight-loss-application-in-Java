/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal;

/**
 *
 * @author micha
 */
public class Person implements java.io.Serializable  {
    private short BMR;
    private short age;

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public short getAge() {
        return age;
    }


    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(short age) {
        this.age = age;
    }

    private float target;

    /**
     * Get the value of Target
     *
     * @return the value of Target
     */
    public float getTarget() {
        return target;
    }

    /**
     * Set the value of Target
     *
     * @param Target new value of Target
     */
    public void setTarget(float Target) {
        this.target = Target;
    }

    private float weight;

    /**
     * Get the value of weight
     *
     * @return the value of weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Set the value of weight
     *
     * @param weight new value of weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    private short height;

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public short getHeight() {
        return height;
    }

    public short getBMR() {
        return BMR;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(short height) {
        this.height = height;
    }

    private boolean gender;

    /**
     * Get the value of gender
     *
     * @return the value of gender
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * Set the value of gender
     *
     * @param gender new value of gender
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Person() {
    }

    public Person(float target, float weight, short height, boolean gender, short age) {
        this.target = target;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.age=age ;
        calculateBMR(weight,height,age,gender);
    }
 public final void calculateBMR(float w, short h, short a, boolean isMan){
    if(isMan){
    this.BMR= (short) (13.397*w+4.799*h-5.677*a+88.362);
    }
    else{
    this.BMR= (short) (9.247*w+3.098*h-4.330*a+447.593);
    }
 }
    public void recalculateBMR(){
    calculateBMR(weight,height,age,gender);
    }
    
    
    
    @Override
    public String toString() {
        return age + "," + target + "," + weight + "," + height + "," + gender;
    }

   

}
