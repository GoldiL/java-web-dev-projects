package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem newItem = new MenuItem(15,"Biryani",MenuItemCategory.MAIN_COURSE, true);
        Menu currentMenu = new Menu(new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        currentMenu.getMainCourse().add(newItem);

        System.out.println(currentMenu.getMainCourse());
    }
}