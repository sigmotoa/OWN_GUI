import javax.swing.*;

public class Main {


    public static void main(String[] args) {
    JFrame frame = new JFrame("Ventana");
    frame.setContentPane(new Welcome().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
}
