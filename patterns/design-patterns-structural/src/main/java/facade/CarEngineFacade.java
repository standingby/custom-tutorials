package facade;

import facade.carsystem.AirFlowController;
import facade.carsystem.CatalyticConverter;
import facade.carsystem.CoolingController;
import facade.carsystem.FuelInjector;
import facade.carsystem.Starter;

/**
 * Simply put, a facade encapsulates a complex subsystem behind a simple interface. It hides much of
 * the complexity and makes the subsystem easy to use.
 *
 * Also, if we need to use the complex subsystem directly, we still can do that; we aren't forced to
 * use the facade all the time.
 *
 * Besides a much simpler interface, there's one more benefit of using this design pattern. It
 * decouples a client implementation from the complex subsystem. Thanks to this, we can make changes
 * to the existing subsystem and don't affect a client.
 */
public class CarEngineFacade {

  private static final Integer DEFAULT_COOLING_TEMP = 90;
  private static final Integer MAX_ALLOWED_TEMP = 50;
  private FuelInjector fuelInjector = new FuelInjector();
  private AirFlowController airFlowController = new AirFlowController();
  private Starter starter = new Starter();
  private CoolingController coolingController = new CoolingController();
  private CatalyticConverter catalyticConverter = new CatalyticConverter();

  public void startEngine() {
    fuelInjector.on();
    airFlowController.takeAir();
    fuelInjector.on();
    fuelInjector.inject();
    starter.start();
    coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
    coolingController.run();
    catalyticConverter.on();
  }

  public void stopEngine() {
    fuelInjector.off();
    catalyticConverter.off();
    coolingController.cool(MAX_ALLOWED_TEMP);
    coolingController.stop();
    airFlowController.off();
  }
}
