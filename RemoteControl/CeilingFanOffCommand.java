public class CeilingFanOffCommand {
  CeilingFan ceilingFan;

  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }
  public void execute() {
    ceilingFan.off();
  }
}
