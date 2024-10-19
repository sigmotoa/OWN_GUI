import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
public class TextFileWriter {
    private String fileName;
    private FileWriter fileWriter;
    private FileReader fileReader;
    private File 


    public TextFileWriter(String fileName)
    {
        this.fileName=fileName;

    }
    public void openFile() throws IOException {
        fileWriter = new FileWriter(fileName);
        fileReader = new FileReader(fileName);
    }
    public void writeToFile(String content) throws
            IOException {
        if(fileWriter==null) {
            throw new IllegalStateException("File is not open. Call openFile");
        }

        fileWriter.write(content);

    }
    public void closeFile() throws IOException{
        if(fileWriter!=null)
        {
            fileWriter.close();
        }
    }
    public void readFile() throws IOException{
        if(fileReader!=null)
        {
            System.out.println(fileReader.read());
        }

    }

}
