package facade.carsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AirFlowController {

  private AirFlowMeter airFlowMeter;

  public void takeAir() {
    airFlowMeter.getMeasurements();
    log.info("Air provided.");
  }

  public void off() {
    log.info("Air controller switched off.");
  }

}
