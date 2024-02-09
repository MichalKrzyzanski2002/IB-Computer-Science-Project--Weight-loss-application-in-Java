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
public class Period implements java.io.Serializable {
    private Day[] days = new Day[0];
    private String name="";

    @Override
    public String toString() {
        return  name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Period(Day[] days) {
        this.days = days;
    }

    Period() {
        
    }

    public Day[] getDays() {
        return days;
    }

    public void setDays(Day[] days) {
        this.days = days;
    }
    public void addDay(Day day){
    days=Arrays.copyOf(days, days.length+1);
    days[days.length-1]=day;
    }
    public void removeDay(Day d){
    for(int i=0; i<days.length; i++){
        if(days[i].equals(d)){
        days[i]=days[days.length-1];
        days=Arrays.copyOf(days, days.length-1);
        }
    
    }
    }
}
