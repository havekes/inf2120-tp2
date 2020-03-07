package ca.uqam.inf2120;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String arg[]) {
        SwingUtilities.invokeLater(() -> new Window());
    }
}
