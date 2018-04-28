import java.util.*;

public class Waitress {
  ArrayList<Menu> menus;

  public Waitress(ArrayList<Menu> menus) {
    this.menus = menus;
  }

  public void printMenu() {
    Iterator<Menu> menuIterator = menus.iterator();

    while (menuIterator.hasNext()) {
      Menu menus = menuIterator.next();
      printMenu(menus.createIterator());
    }
  }

  private void printMenu(Iterator<Menu> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem)iterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }
}
