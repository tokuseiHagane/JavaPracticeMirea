package ru.mirea.task8;
import javax.swing.*;

public class TaskSecond {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Task 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,600);
        ImageIcon icon = new ImageIcon("");
        for (String arg : args)
        {
            icon = new ImageIcon(arg);
            break;
        }
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setVisible(true);
    }
}