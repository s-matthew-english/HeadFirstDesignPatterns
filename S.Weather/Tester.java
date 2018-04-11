import java.util.Optional;

public class Tester {
  public static void main(String[] args) {
    if (function().equals(Optional.empty())) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }

  public static Optional<Integer> function() {
    return Optional.empty();
  }
}
