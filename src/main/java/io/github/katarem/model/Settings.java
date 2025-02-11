package io.github.katarem.model;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Settings {
    private long delay;
    private ChronoUnit timeUnit;

    public Settings(long afkDelay, ChronoUnit timeUnit) {
        this.delay = afkDelay;
        this.timeUnit = timeUnit;

    }

    public Duration getDelay() {
        return Duration.of(delay, timeUnit);
    }

}
