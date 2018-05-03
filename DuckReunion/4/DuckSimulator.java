public class DuckSimulator {
  public static void main(String... args) {
    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();

    simulator.simulate(duckFactory);
  }

  void simulate(AbstractDuckFactory duckFactory) {
    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());

    System.out.println("\nDuck Simulator: With Composite - Flocks");

    Flock flockOfDucks = new Flock();

    flockOfDucks.add(redheadDuck);
    flockOfDucks.add(duckCall);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(gooseDuck);

    Flock flockOfMallards = new Flock();

    Quackable mallardDuck0 = duckFactory.createMallardDuck();
    Quackable mallardDuck1 = duckFactory.createMallardDuck();
    Quackable mallardDuck2 = duckFactory.createMallardDuck();
    Quackable mallardDuck3 = duckFactory.createMallardDuck();

    flockOfMallards.add(mallardDuck0);
    flockOfMallards.add(mallardDuck1);
    flockOfMallards.add(mallardDuck2);
    flockOfMallards.add(mallardDuck3);

    flockOfDucks.add(flockOfMallards);

    System.out.println("\nDuck Simulator: Whole Flock Simulation");
    simulate(flockOfDucks);

    System.out.println("\nDuck Simulator: Mallard Flock Simulation");
    simulate(flockOfMallards);

    System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
  }

  void simulate(Quackable duck) {
    duck.quack();
  }
}
