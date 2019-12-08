package bridge;

import bridge.color.Blue;
import bridge.color.Red;
import bridge.shape.Shape;
import bridge.shape.Square;
import bridge.shape.Triangle;

/**
 * The official definition for the Bridge design pattern introduced by Gang of Four (GoF) is to
 * decouple an abstraction from its implementation so that the two can vary independently. This
 * means to create a bridge interface that uses OOP principles to separate out responsibilities into
 * different abstract classes.
 *
 * This is a good choice in the following cases: When we want a parent abstract class to define the
 * set of basic rules, and the concrete classes to add additional rules When we have an abstract
 * class that has a reference to the objects, and it has abstract methods that will be defined in
 * each of the concrete classes
 *
 * This is a good choice in the following cases:
 *
 * When we wish to add, enhance or even remove the behavior or state of objects
 * When we just want to modify the functionality of a single object of class and leave others
 * unchanged
 */
public class BridgePatternDriver {

  public static void main(String[] args) {
    //a square with red color
    Shape square = new Square(new Red());
    System.out.println(square.draw());

    //a triangle with blue color
    Shape triangle = new Triangle(new Blue());
    System.out.println(triangle.draw());
  }
}
