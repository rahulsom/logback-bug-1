package logback.bug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass {
  public void doSomething() {
    Logger logger = LoggerFactory.getLogger(getClass());

    logger.info("Info");
    logger.debug("Debug");
    logger.warn("Warn");
    logger.error("Error");
  }
}
