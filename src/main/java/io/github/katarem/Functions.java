package io.github.katarem;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyAdapter;
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

    public static Frame setupFrame() {
        Frame frame = new Frame();

        frame.setSize(200, 200);
        frame.setUndecorated(true);
        frame.setOpacity(0.0f);
        frame.setVisible(true);

        frame.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.out.println("Cerrando...");
                    System.exit(0);
                }
            }

        });
        return frame;
    }

    public static void simulateMovement(long afkDelay) {
        try {
            Robot robot = new Robot();
            while (true) {
                System.out.println("Simulando movimiento...");
                robot.keyPress(KeyEvent.VK_F);
                Thread.sleep(Duration.ofMinutes(afkDelay));
            }
        } catch (InterruptedException | AWTException e) {
            // Ignore
        }

    }

    public static void focusRequester(Frame frame) {
        try {

            Runnable focusTask = () -> {

                try {
                    while (true) {
                        Thread.sleep(200L);
                        frame.requestFocus();
                    }
                } catch (InterruptedException e) {
                    // Ignore
                }

            };

            var t = new Thread(focusTask);
            t.start();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
