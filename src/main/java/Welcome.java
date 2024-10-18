import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Welcome extends JFrame {
    private JButton btn1;
    public JPanel panel1;
    private JTextField txt1;
    private JTextField txt2;
    private JLabel nombreLabel;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JTextField txt3;


    private Dimension textDimen = new Dimension(100, 30);


    public Welcome() {
        setTitle("Ventana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel();
        btn1 = new JButton();
        txt1 = new JTextField();
        txt2 = new JTextField();
        nombreLabel = new JLabel("Nombre");
        txt3 = new JTextField();
        btn2 = new JButton("Error");
        btn3 = new JButton("Mensajes");
        btn4 = new JButton("Opciones");

        btn1.setText("Tocame");
        panel1.add(txt1);
        panel1.add(txt2);
        panel1.add(txt3);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn4);

        this.setContentPane(panel1);
        txt1.setPreferredSize(textDimen);
        txt2.setPreferredSize(textDimen);
        txt3.setPreferredSize(textDimen);

        panel1.setPreferredSize(new Dimension(200, 300));
        btn1.addActionListener(new ActionListener() {
            int touchTimes = 1;
            String name;


            @Override
            public void actionPerformed(ActionEvent e) {

                //String nameFixed=name;
                Persona p1 = new Persona(txt1.getText(), Integer.valueOf(txt2.getText()));
                JOptionPane.showMessageDialog(null, "Ya estas registrado. " + p1);

            }
        });

        pack();
        setVisible(true);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Errores", "MSG ERROR", 0);

            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Info importante", "Info", 1);
                //JOptionPane.showMessageDialog(null, "Info importante", "Info", 3);
                String dato;
                dato = JOptionPane.showInputDialog(null, "Ingrese su codigo", "Codigo", 3);
                if (dato != null) {
                    JOptionPane.showMessageDialog(null, dato, "Codigo del Estudiante", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Falto el codigo", "Error", 2);
                }
            }
        });
        panel1.addComponentListener(new ComponentAdapter() {
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(null,"¿Quiere realizar la acción?");
                if(option==0){
                    JOptionPane.showMessageDialog(null,option);
                }
                else if (option==1)
                {
                    JOptionPane.showMessageDialog(null,"Me pulsaron el NO");
                }
                else {
                    JOptionPane.showMessageDialog(null, option);
                }
            }
        });
    }


}










