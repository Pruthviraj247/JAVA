import java.io.File;
import java.io.IOException;

public class File_Crate_IF_ELSE_Using_Try {
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\pruthviraj\\Java_Main\\8_File_Handling\\src\\Main.txt");
        try {
            if (file.createNewFile())
            {
                System.out.println("File Created Successfully");
            }
            else
            {
                System.out.println("File Is Already Exist");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
