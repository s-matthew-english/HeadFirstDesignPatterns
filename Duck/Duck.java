public abstract class Duck {

  FlyBehaviour flyBehaviour;
  QuackBehaviour quackBehaviour;

  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehaviour.fly();
  }

  public void setFlyBehaviour(FlyBehaviour fb) {
    flyBehaviour = fb;
  }

  public void performQuack() {
    quackBehaviour.quack();
  }

  public void setQuackBehaviour(QuackBehaviour qb) {
    quackBehaviour = qb;
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}
