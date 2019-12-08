package facade.carsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoolingController {

  private static final Integer DEFAULT_RADIATOR_SPEED = 10;

  private Integer temperatureUpperLimit;
  private Radiator radiator = new Radiator();
  private TemperatureSensor sensor = new TemperatureSensor();

  public void setTemperatureUpperLimit(Integer temperatureUpperLimit) {
    log.info("Setting temperature upper limit to {}", temperatureUpperLimit);
    this.temperatureUpperLimit = temperatureUpperLimit;
  }

  public void run() {
    log.info("Cooling controller ready.");
    radiator.setSpeed(DEFAULT_RADIATOR_SPEED);
  }

  public void cool(Integer maxAllowedTemperature) {
    log.info("Scheduled cooling with maximum allowed temperature {}", maxAllowedTemperature);
    radiator.on();
  }

  public void stop() {
    log.info("Stopping Cooling Controller..");
    radiator.off();
  }
}
