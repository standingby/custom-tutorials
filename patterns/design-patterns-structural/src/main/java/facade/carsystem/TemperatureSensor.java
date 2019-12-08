package facade.carsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TemperatureSensor {

  public void getTemperature() {
    log.info("Getting temperature from the sensor.");
  }
}
