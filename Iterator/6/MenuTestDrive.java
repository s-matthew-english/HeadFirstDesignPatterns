import java.util.ArrayList;

public class MenuTestDrive {
  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    // ArrayList<Menu> menus = new ArrayList<Menu>();
    // menus.add(pancakeHouseMenu);
    // menus.add(dinerMenu);

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

    waitress.printMenu();
    waitress.printVegetarianMenu();

    System.out.println("\nCustomer asks, \"Is the Hotdog vegetarian?\"");
    System.out.println("Waitress says: ");
    if (waitress.isItemVegetarian("Hotdog")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    System.out.println("\nCustomer asks, \"Are the Waffles vegetarian?\"");
    if (waitress.isItemVegetarian("Waffles")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
