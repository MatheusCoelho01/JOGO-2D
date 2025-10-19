package org.gamer.modelo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class Fase extends JPanel {

    private Image fundo;

    public Fase() {
        // Coloque o arquivo em: src/main/resources/res/fundo.png
        try (InputStream is = getClass().getResourceAsStream("/res/fundo.png")) {
            if (is != null) {
                fundo = ImageIO.read(is);
            } else {
                System.err.println("Imagem não encontrada em /res/fundo.png");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        setPreferredSize(new Dimension(1024, 728));
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (fundo != null) {
            // desenha a imagem escalando para todo o painel
            g.drawImage(fundo, 0, 0, getWidth(), getHeight(), this);
        } else {
            // fallback: fundo de cor
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.WHITE);
            g.drawString("Imagem não carregada", 20, 20);
        }
    }
}
