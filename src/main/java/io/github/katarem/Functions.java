package io.github.katarem;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Properties;

import io.github.katarem.model.Settings;

public class Functions {

    private Functions() {
    }

    public static Settings loadSettings() throws IOException {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("./config.props"));
            long delay = Long.parseLong(p.getProperty("keyDelay", "5"));
            ChronoUnit timeUnit = ChronoUnit.valueOf(p.getProperty("timeUnit", "MINUTES"));
            return new Settings(delay, timeUnit);
        } catch (IOException e) {
            return new Settings(5, ChronoUnit.MINUTES);
        }
    }

    public static void simulateMovement(Duration delay) {
        try {
            Robot robot = new Robot();
            while (true) {
                System.out.println("Simulating movement...");
                robot.keyPress(KeyEvent.VK_F);
                Thread.sleep(delay);
            }
        } catch (InterruptedException | AWTException e) {
            // Ignore
        }

    }

}
