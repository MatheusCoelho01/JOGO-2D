package org.gamer.modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {

    private int x, y;
    private int dx, dy;
    private Image imagem;
    private int altura, largura;

    public Player() {
        this.x = 100;
        this.y = 100;
    }

    public void load() {
        //imagem de jogador
        ImageIcon referencia = new ImageIcon("res/nave.png");
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
    }

    public void update() {
        //movimentação dos eixos
        x += dx;
        y += dy;
    }

    public void KeyPressed(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_UP) {
            dy = 3;
        }
        if (codigo == KeyEvent.VK_DOWN) {
            dy = -3;
        }
        if (codigo == KeyEvent.VK_LEFT) {
            dx = -3;
        }
        if (codigo == KeyEvent.VK_RIGHT) {
            dx = 3;
        }
    }

    public void KeyRelease(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_UP) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_DOWN) {
            dy = -0;
        }
        if (codigo == KeyEvent.VK_LEFT) {
            dx = -0;
        }
        if (codigo == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }
}
