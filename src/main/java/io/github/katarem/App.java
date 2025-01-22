package io.github.katarem;

import java.awt.Frame;
import java.io.IOException;

import io.github.katarem.model.Settings;

public class App {
    public static void main(String[] args) {
        try {

            Settings settings = Functions.loadSettings();

            Long delay = settings.getDelay();

            Frame frame = Functions.setupFrame();

            Functions.simulateMovement(delay);
            Functions.focusRequester(frame);

        } catch (IOException e) {
        }
    }
}
