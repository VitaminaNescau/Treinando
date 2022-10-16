package relogio.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import relogio.function.hours;

public class principal {
    public static void main(String[] args) {
        hours time = new hours();
        time.horas();
        JFrame frame = new JFrame("Relogio");
        frame.setSize(400,200);
        frame.setResizable(false);
        JLabel texto = new JLabel();
        JPanel painel = new JPanel();
        JButton button = new JButton("Alarme");
       // painel.setBackground(Color.BLACK);
        frame.getContentPane();
        Dimension size = texto.getPreferredSize();
        texto.setBounds(0 ,1,size.width,size.height);
        button.setBounds(20, 145, 100, 15);
        painel.setLayout(null);
        painel.add(button);
        frame.add(painel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
