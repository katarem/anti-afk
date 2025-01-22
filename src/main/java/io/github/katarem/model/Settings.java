package io.github.katarem.model;

public class Settings {
    private long delay;

    public long getDelay() {
        return delay;
    }

    public void setDelay(long afkDelay) {
        this.delay = afkDelay;
    }

    public Settings(long afkDelay) {
        this.delay = afkDelay;
    }

}
