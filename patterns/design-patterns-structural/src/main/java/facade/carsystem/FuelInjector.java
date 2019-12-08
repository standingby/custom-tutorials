package facade.carsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FuelInjector {

  private FuelPump fuelPump = new FuelPump();

  public void on() {
    log.info("Fuel injector ready to inject fuel.");
  }

  public void inject() {
    fuelPump.pump();
    log.info("Fuel injected.");
  }

  public void off() {
    log.info("Stopping fuel injector.");
  }
}
