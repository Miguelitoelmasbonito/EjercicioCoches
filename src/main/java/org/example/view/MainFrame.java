package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField marcaField;
    private JTextField modeloField;
    private JTextField matriculaField;
    private JTextField anyoField;
    private JTextField fechaventaField;
    private JTextArea cochesArea;
    private JButton agregarButton;
    private JButton listarButton;

    public MainFrame() {
        setTitle("Gestor de Coches");
        setSize(640, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ImageIcon logo = new ImageIcon("./src/main/java/org/example/fotito.png");
        Image img = logo.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        logo = new ImageIcon(img);
        JLabel logoLabel = new JLabel(logo);
        add(logoLabel, BorderLayout.SOUTH);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 0));

        inputPanel.add(new JLabel("Marca:"));
        marcaField = new JTextField();
        inputPanel.add(marcaField);

        inputPanel.add(new JLabel("Modelo:"));
        modeloField = new JTextField();
        inputPanel.add(modeloField);

        inputPanel.add(new JLabel("Matrícula:"));
        matriculaField = new JTextField();
        inputPanel.add(matriculaField);

        inputPanel.add(new JLabel("Año:"));
        anyoField = new JTextField();
        inputPanel.add(anyoField);

        inputPanel.add(new JLabel("Fecha Venta:"));
        fechaventaField = new JTextField();
        inputPanel.add(fechaventaField);

        JPanel buttonPanel = new JPanel();
        agregarButton = new JButton("Agregar Coche");
        agregarButton.setBackground(Color.ORANGE);
        buttonPanel.add(agregarButton);

        listarButton = new JButton("Listar Coches");
        listarButton.setBackground(Color.ORANGE);
        buttonPanel.add(listarButton);

        add(buttonPanel, BorderLayout.NORTH);

        add(inputPanel, BorderLayout.SOUTH);

        cochesArea = new JTextArea();
        cochesArea.setBackground(Color.LIGHT_GRAY);
        cochesArea.setForeground(Color.BLACK);
        add(new JScrollPane(cochesArea), BorderLayout.CENTER);
    }

    public String getMarca() {
        return marcaField.getText();
    }

    public String getModelo() {
        return modeloField.getText();
    }

    public String getMatricula() {
        return matriculaField.getText();
    }

    public String getAnyo() {
        return anyoField.getText();
    }

    public String getFechaventa() {
        return fechaventaField.getText();
    }



    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void mostrarCoches(String alumnos) {
        cochesArea.setText(alumnos);
    }

    public void setAgregarButtonListener(ActionListener listener) {
        agregarButton.addActionListener(listener);
    }

    public void setListarButtonListener(ActionListener listener) {
        listarButton.addActionListener(listener);
    }
}
