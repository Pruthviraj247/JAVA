import java.io.File;
import java.util.Scanner;

public class File_Reading_Data {
    public static void main(String[] args)
    {
        try {
            File file = new File("C:\\Users\\pruthviraj\\Java_Main\\8_File_Handling\\src\\Main1.txt");
            Scanner str = new Scanner(file);
            while (str.hasNextLine())
            {
                String Data = str.nextLine();
                System.out.println(Data);
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
