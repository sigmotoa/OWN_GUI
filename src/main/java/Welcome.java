import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome {
    private JButton btn1;
    public JPanel panel1;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;

    private Dimension textDimen = new Dimension(100,30);


    public Welcome() {
        panel1 = new JPanel();
        btn1 = new JButton();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();

        btn1.setText("Tocame");
        panel1.add(txt1);
        panel1.add(txt2);
        panel1.add(txt3);
        panel1.add(btn1);

        txt1.setPreferredSize(textDimen);
        txt2.setPreferredSize(textDimen);
        txt3.setPreferredSize(textDimen);

        panel1.setPreferredSize(new Dimension(200, 200));
        btn1.addActionListener(new ActionListener() {
                int touchTimes = 1;
                String name;



            @Override
            public void actionPerformed(ActionEvent e) {

                //String nameFixed=name;
                Persona p1 = new Persona(txt1.getText(),Integer.valueOf(txt2.getText()));
                JOptionPane.showMessageDialog(null,"Ya estas registrado. "+p1);

            }
        });
    }




}










