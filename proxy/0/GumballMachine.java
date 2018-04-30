public class GumballMachine {

  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State winnerState;

  State state = soldOutState;
  int count = 0;
  String location;

  public GumballMachine(String location, int count) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    this.count = count;
    if (count > 0) {
      state = noQuarterState;
    }
    this.location = location;
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  void releaseBall() {
    System.out.println("A gumball comes rolling out of the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }

  int getCount() {
    return count;
  }

  void refill(int count) {
    this.count += count;
    //System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
    //state.refill();
    state = noQuarterState;
  }

  void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getWinnerState() {
    return winnerState;
  }

  public String getLocation() {
    return location;
  }

  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2004");
    result.append("\nInventory: " + count + " gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n");
    result.append("Machine is " + state + "\n");
    return result.toString();
  }
}












