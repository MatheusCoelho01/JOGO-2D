package org.gamer.container;

import org.gamer.modelo.Fase;

import javax.swing.*;

public class Container extends JFrame {

    public Container() {
        add(new Fase());
        setTitle("Gamer");
        setSize(1024, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);// Impede redimensionamento da janela
        setVisible(true);

    }

    public static void main(String[] args) {
        new Container();
    }

}
