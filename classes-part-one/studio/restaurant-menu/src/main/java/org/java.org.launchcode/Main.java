import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem newItem = new MenuItem(15,"Biryani",MenuItemCategory.MAIN_COURSE.name(), true);
        Menu currentMenu = new Menu(new java.util.Date(),new ArrayList<>());

        System.out.println(currentMenu.getMainCourse());
    }
}