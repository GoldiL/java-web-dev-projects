package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //private Date lastUpdated;
    private LocalDate lastUpdated;


    private ArrayList<MenuItem> appetizer;

    private ArrayList<MenuItem> dessert;

    private ArrayList<MenuItem> mainCourse;

    public Menu(ArrayList<MenuItem> appetizer, ArrayList<MenuItem> mainCourse, ArrayList<MenuItem> dessert) {
        this.lastUpdated =  LocalDate.now();
        this.appetizer = appetizer;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }



    public ArrayList<MenuItem> getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(ArrayList<MenuItem> appetizer) {
        this.appetizer = appetizer;
    }

    public ArrayList<MenuItem> getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(ArrayList<MenuItem> mainCourse) {
        this.mainCourse = mainCourse;
    }

    public ArrayList<MenuItem> getDessert() {
        return dessert;
    }

    public void setDessert(ArrayList<MenuItem> dessert) {
        this.dessert = dessert;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public LocalDate getLast() {
        LocalDate last = null;
        return last;
    }


    @Override
    public String toString() {

        return "Menu{" +
                "lastUpdated=" + lastUpdated +
                ", appetizer=" + appetizer +
                ", dessert=" + dessert +
                ", mainCourse=" + mainCourse +
                '}';
    }

    //adding new item to the newly created Menu
    public void addMenuItem(MenuItem newItem){
        this.appetizer.add(newItem);
        this.dessert.add(newItem);
        this.mainCourse.add(newItem);

    }

    //Removing item from the new menu
    public void removeMenuItem(MenuItem removeItem){
        this.removeMenuItem(removeItem);
    }


}
