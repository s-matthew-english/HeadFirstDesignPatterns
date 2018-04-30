import java.lang.reflect.*;

public class NonOwnerInvocationHandler implements InvocationHandler {
  PersonBean person;

  public NonOwnerInvocationHandler(PersonBean person) {
    this.person = person;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalArgumentException {

    try {
      if (method.getName().startsWith("get")) {
        return method.invoke(person, args);
      } else if (method.getName().equals("setHorOrNotRating")) {
        return method.invoke(person, args);
      } else if (method.getName().startsWith("set")) {
        throw new IllegalArgumentException();
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }

    return null;
  }
}
