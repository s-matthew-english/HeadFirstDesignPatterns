public class SingletonTestDrive {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();

    singleton.talk();
  }
}
