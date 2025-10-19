package org.gamer.modelo;

import javax.swing.*;
import java.awt.*;

public class Fase extends JFrame{

    private Image fundo;

    public Fase(){
        ImageIcon referencia = new ImageIcon("res\\fundo.png");
        fundo = referencia.getImage();
    }

    public void pintarFase(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0,0, null);
        g.dispose();
    }
}
