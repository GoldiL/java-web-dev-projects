package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem newMainItem = new MenuItem(15,"Biryani",MenuItemCategory.MAIN_COURSE, true);
        MenuItem newAppItem = new MenuItem(5,"Vadai",MenuItemCategory.APPETIZER, true);
        MenuItem newDessertItem = new MenuItem(10,"Rasamalai",MenuItemCategory.DESSERT, true);
        MenuItem newItem = new MenuItem(25,"Veg Thaili",MenuItemCategory.MAIN_COURSE, true);
        MenuItem newItem2 = new MenuItem(25,"Veg Thaili",MenuItemCategory.MAIN_COURSE, true);

        Menu currentMenu = new Menu(new ArrayList<>(),new ArrayList<>(),new ArrayList<>());

        //adding item using getter
        //currentMenu.getMainCourse().add(newItem);

        //adding item using method
        currentMenu.addMenuItem(newMainItem);
        currentMenu.addMenuItem(newAppItem);
        currentMenu.addMenuItem(newDessertItem);
        currentMenu.addMenuItem(newItem);

        //removing an item
     //  currentMenu.removeMenuItem(newItem);

        System.out.println(currentMenu.getMainCourse());
      //  System.out.println(currentMenu.getMainCourse());
        System.out.println(newItem.equals(newItem2));
        System.out.println(currentMenu.toString());
    }
}