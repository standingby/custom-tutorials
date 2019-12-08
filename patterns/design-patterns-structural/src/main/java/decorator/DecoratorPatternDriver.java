package decorator;

import decorator.decoration.BubbleLights;
import decorator.decoration.Garland;
import lombok.extern.slf4j.Slf4j;

/**
 * A Decorator pattern can be used to attach additional responsibilities to an object either
 * statically or dynamically. A Decorator provides an enhanced interface to the original object.
 *
 * In the implementation of this pattern, we prefer composition over an inheritance – so that we can
 * reduce the overhead of subclassing again and again for each decorating element. The recursion
 * involved with this design can be used to decorate our object as many times as we require.
 */
@Slf4j
public class DecoratorPatternDriver {

  public static void main(String[] args) {
    // christmas tree with just one Garland
    ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());

    // christmas tree with two Garlands and one Bubble lights
    ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
  }

}
