import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        JLabel label = new JLabel("Hello World");

        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
    
