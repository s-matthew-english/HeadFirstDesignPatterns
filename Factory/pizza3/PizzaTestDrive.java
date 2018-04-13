public class PizzaTestDrive {

  public static void main(String[] args) {
    DependentPizzaStore nyStore = new DependentPizzaStore();
    DependentPizzaStore chicagoStore = new DependentPizzaStore();

    Pizza pizza = nyStore.createPizza("NY", "cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.createPizza("Chicago", "cheese");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
  }
}
