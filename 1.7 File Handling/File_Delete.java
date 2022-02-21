import java.io.File;

public class File_Delete {
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\pruthviraj\\Java_Main\\8_File_Handling\\src\\Main2.txt");
        if (file.delete())
        {
            System.out.println("Your File Successfully Deleted");
        }
        else
        {
            System.out.println("Operation Failed");
        }
    }
}
