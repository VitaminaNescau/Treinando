package relogio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class principal {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("relogio/teste.png");
        hours time = new hours();
        time.horas();
        JFrame frame = new JFrame("Relogio");
        frame.setSize(400,400);
        JLabel texto = new JLabel();
        JPanel painel = new JPanel();
        JButton button = new JButton("Teste");
       // painel.setBackground(Color.BLACK);
        texto.setIcon(image);
        frame.getContentPane();
        Dimension size = texto.getPreferredSize();
        texto.setBounds(0 ,1,size.width,size.height);
        button.setBounds(180, 150, 70, 30);
        painel.setLayout(null);
        painel.add(button);
        painel.add(texto);
        frame.add(painel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
