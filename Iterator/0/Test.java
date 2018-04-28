import java.util.*;

public class Test {

  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

    DinerMenu dinerMenu = new DinerMenu();
    MenuItem[] lunchItems = dinerMenu.getMenuItems();

    // for (int i = 0; i < breakfastItems.size(); i++) {
    for (MenuItem menuItem : breakfastItems) {
      //MenuItem menuItem = breakfastItems.get(i);
      System.out.print(menuItem.getName() + " ");
      System.out.println(menuItem.getPrice() + " ");
      System.out.println(menuItem.getDescription() + "\n");
    }

    //for (int i = 0; i < lunchItems.length; i++) {
    for (MenuItem menuItem : lunchItems) {
      //MenuItem menuItem = lunchItems[i];
      System.out.print(menuItem.getName() + " ");
      System.out.println(menuItem.getPrice() + " ");
      System.out.println(menuItem.getDescription() + "\n");
    }
  }
}
