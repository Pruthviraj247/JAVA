import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound_Exception {
    public static void main(String[] args)
    {
        try {
            File  One = new File("NoFile.txt");
            FileReader Fi = new FileReader(One);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("This File Doesn't Exist");
        }
    }
}
