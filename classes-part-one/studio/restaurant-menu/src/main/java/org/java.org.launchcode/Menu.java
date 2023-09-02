

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    //private Date lastUpdated;
    private Date lastUpdated;
    private ArrayList<MenuItem> appetizer;
    private ArrayList<MenuItem> mainCourse;

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

    private ArrayList<MenuItem> dessert;

    public LocalDate getLast() {
        LocalDate last = null;
        return last;
    }

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void addMenuItem(MenuItem newItem){
       this.appetizer.add(newItem);
       this.dessert.add(newItem);
       this.mainCourse.add(newItem);

    }

    public void removeMenuItem(MenuItem removeItem){
        //if(removeItem.isNew())
    }

    //public ArrayList<MenuItem> getItems() {
//        return items;
//    }
}
