package facade.carsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Radiator {

  public void on() {
    log.info("Radiator switched on.");
  }

  public void off() {
    log.info("Radiator switched off.");
  }

  public void setSpeed(Integer speed) {
    log.info("Setting speed to {}", speed);
  }
}
