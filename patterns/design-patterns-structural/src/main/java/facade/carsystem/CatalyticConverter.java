package facade.carsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CatalyticConverter {

  public void on() {
    log.info("Catalytic converter switched on.");
  }

  public void off() {
    log.info("Catalytic converter switched off.");
  }

}
