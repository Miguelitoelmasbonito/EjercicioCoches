package org.example;

import org.example.controller.CocheController;
import org.example.model.CocheManager;
import org.example.view.MainFrame;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame ();
            CocheManager model = new CocheManager();
            new CocheController(frame, model);
            frame.setVisible(true);

        });
    }
}