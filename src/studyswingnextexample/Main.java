package studyswingnextexample;
import javax.swing.*;
import  java.awt.*;


public class Main extends JFrame{

    public Main(){

        this.setDefaultCloseOperation(3);
        initComponents();
        this.setBounds(300, 300, 300, 200);
    }

    public void initComponents(){
        button1.setPreferredSize(new Dimension(100, 100));
        button2.setPreferredSize(button2.getPreferredSize());
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        this.getContentPane().add(panel, BorderLayout.CENTER);
    }

    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING));

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");

    public static void main(String[] args) {
        new Main().setVisible(true);
    }

}
