public class MenuItem {
  String name;
  String description;
  boolean vegatarian;
  double price;

  public MenuItem(String name,
                  String description,
                  boolean vegatarian,
                  double price) {
    this.name = name;
    this.description = description;
    this.vegatarian = vegatarian;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public boolean isVegatarian() {
    return vegatarian;
  }
}
