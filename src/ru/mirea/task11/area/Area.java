package ru.mirea.task11.area;

import javax.swing.*;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Area extends JFrame {
    private JPanel mainPanel;
    private JRadioButton colour1;
    private JRadioButton colour2;
    private JRadioButton colour3;
    private JLabel textLabel;
    private JRadioButton font1;
    private JRadioButton font2;
    private JRadioButton font3;

    public Area() {

        //textLabel.setFont(new Font("Arial", Font.BOLD, 22));

        colour1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colour2.setSelected(false);
                colour3.setSelected(false);
                textLabel.setForeground(Color.BLACK);
            }
        });
        colour2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colour1.setSelected(false);
                colour3.setSelected(false);
                textLabel.setForeground(Color.RED);
            }
        });
        colour3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colour1.setSelected(false);
                colour2.setSelected(false);
                textLabel.setForeground(Color.YELLOW);
            }
        });
        font1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setFont(new Font("Arial", Font.BOLD, 12));
                font2.setSelected(false);
                font3.setSelected(false);
            }
        });
        font2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setFont(new Font("Times New Romans", Font.BOLD, 20));
                font2.setSelected(false);
                font3.setSelected(false);
            }
        });
        font3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setFont(new Font("Courier", Font.BOLD, 12));
                font1.setSelected(false);
                font2.setSelected(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Area");
        frame.setContentPane(new Area().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
