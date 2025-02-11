package io.github.katarem;

import java.io.IOException;

import io.github.katarem.model.Settings;

public class App {
    public static void main(String[] args) {
        try {

            Settings settings = Functions.loadSettings();
            Functions.simulateMovement(settings.getDelay());

        } catch (IOException e) {
        }
    }
}
