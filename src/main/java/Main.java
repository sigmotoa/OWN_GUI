import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //JFrame frame = new JFrame("Ventana");
        //frame.setContentPane(new Welcome().panel1);

      //  frame.pack();
        //  frame.setVisible(true);
        //new Welcome();

        TextFileWriter writer = new TextFileWriter("archivo.txt");
        try {
            writer.openFile();
            writer.writeToFile("Hola\n");
            writer.writeToFile("Linea 3");
            writer.readFile();

            System.out.println("Todo correcto");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                writer.closeFile();
                //writer.openFile();
                //writer.readFile();
            }catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }

        

    }


}
