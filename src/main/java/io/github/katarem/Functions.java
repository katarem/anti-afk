package io.github.katarem;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
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
            return new Settings(delay);
        } catch (IOException e) {
            return new Settings(5);
        }
    }

    public static void simulateMovement(long afkDelay) {
        try {
            Robot robot = new Robot();
            while (true) {
                System.out.println("Simulating movement...");
                robot.keyPress(KeyEvent.VK_F);
                Thread.sleep(Duration.ofMinutes(afkDelay));
            }
        } catch (InterruptedException | AWTException e) {
            // Ignore
        }

    }

}
