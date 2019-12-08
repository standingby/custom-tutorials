package proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExpensiveObjectImpl implements ExpensiveObject {

  public ExpensiveObjectImpl() {
    heavyInitialConfiguration();
  }

  @Override
  public void process() {
    log.info("Processing complete.");
  }

  private void heavyInitialConfiguration() {
    log.info("Loading initial configuration");
  }
}
