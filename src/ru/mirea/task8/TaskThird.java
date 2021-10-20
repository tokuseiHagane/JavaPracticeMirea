package ru.mirea.task8;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;
import java.lang.Thread;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TaskThird extends JPanel {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 1000;

    private JFrame frame;
    private Timer timer;
    private Image image;
    public TaskThird() {
        frame = new JFrame("Task 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(this);
        frame.setVisible(true);
        image = new ImageIcon("src/ru/mirea/task8/animate/0.png").getImage();
        timer = new Timer();
        timer.schedule(animate, 1,400);
    }

    TimerTask animate = new TimerTask() {

        @Override
        public void run() {
            for(int i = 0; i <= 157; i++) {
                image = new ImageIcon("src/ru/mirea/task8/animate/"+i+".jpg").getImage();
                if (i == 157) {
                    i = 0;
                }
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
            }
        }
    };

    public void paint(Graphics canvas) {
        canvas.drawImage(image, 0, 0,  null);
    }

    public static void main(String[] args) {
        new TaskThird();
    }
}
