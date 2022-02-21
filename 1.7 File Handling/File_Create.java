import java.io.File;
import java.io.IOException;

public class File_Create {
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\pruthviraj\\Java_Main\\8_File_Handling\\src\\User Input.txt");
        try {
            String str = String.valueOf(file.createNewFile());
            System.out.println(file.getName()+" Successfully Created");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
