package logback1210;

import logback.bug.MyClass;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemErr;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LogbackConfigTest {
  @Test
  void testSomething() throws Exception {
    String s = tapSystemErr(() -> {
      new MyClass().doSomething();
    });
    assertEquals("WARN  - Warn\nERROR - Error\n", s);
  }
}
