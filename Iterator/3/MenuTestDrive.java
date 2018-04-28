import java.util.*;

public class MenuTestDrive {
  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    ArrayList<Menu> allMenus = new ArrayList<>();

    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    Waitress waitress = new Waitress(allMenus);

    waitress.printMenu();
  }
}
