public class Light {
  String location = "";

  public Light(String location) {
    this.location = location;
  }

  public void on() {
    System.out.println("on");
  }
  
  public void off() {
    System.out.println("off");
  }
}
