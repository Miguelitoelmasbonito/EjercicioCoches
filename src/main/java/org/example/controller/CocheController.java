package org.example.controller;

import org.example.model.Coche;
import org.example.model.CocheManager;
import org.example.view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CocheController {
    private MainFrame view;
    private CocheManager model;
    private List<Coche> coches;

    public CocheController(MainFrame view, CocheManager model) {
        this.view = view;
        this.model = model;
        this.coches = model.cargarCoches();

        view.setAgregarButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCoche();
            }
        });

        view.setListarButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarCoches();
            }
        });
    }

    private void agregarCoche() {
        String marca = view.getMarca();
        String modelo = view.getModelo();
        String matricula = view.getMatricula();
        int anyo;
        String fechaventa = view.getFechaventa();

        try {
            anyo = Integer.parseInt(view.getAnyo());
            Coche coche = new Coche(marca, modelo, matricula, anyo, fechaventa);
            coches.add(coche);
            model.guardarCoches(coches);
            view.mostrarMensaje("Coche agregado correctamente.");
        } catch (NumberFormatException e) {
            view.mostrarMensaje("Por favor, ingrese un año válido.");
        }
    }

    private void listarCoches() {
        StringBuilder sb = new StringBuilder();
        for (Coche c : coches) {
            sb.append(c.toString()).append("\n"); // Asegúrate de que Coche tenga un buen método toString
        }
        view.mostrarCoches(sb.toString());
    }
}
