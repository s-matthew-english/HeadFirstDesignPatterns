public class CeilingFanOnCommand {
  CeilingFan ceilingFan;

  public CeilingFanOnCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }
  public void execute() {
    ceilingFan.high();
  }
}
