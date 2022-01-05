import ch.qos.logback.classic.filter.ThresholdFilter
import static ch.qos.logback.classic.Level.*

appender("CONSOLE", ConsoleAppender) {
  filter(ThresholdFilter) {
    level = WARN
  }
  encoder(PatternLayoutEncoder) {
    pattern = "%-5level - %msg%n"
  }
  target = "System.err"
}

logger("logback.bug", DEBUG)
root(WARN, ["CONSOLE"])
