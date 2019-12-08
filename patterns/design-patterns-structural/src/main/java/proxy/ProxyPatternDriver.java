package proxy;

/**
 * The Proxy pattern allows us to create an intermediary that acts as an interface to another
 * resource, while also hiding the underlying complexity of the component.
 */
public class ProxyPatternDriver {

  public static void main(String[] args) {
    ExpensiveObject object = new ExpensiveObjectProxy();
    object.process();
    object.process();
  }
}
