import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class File_Write_Data {
    public static void main(String[] args)
    {
        try {
            FileWriter Writer = new FileWriter("C:\\Users\\pruthviraj\\Java_Main\\8_File_Handling\\src\\Main1.txt");
            Writer.write("We All Love Mathematics");
            Writer.write("\n");
            Writer.write("We All Love Java Language");
            Writer.close();
            System.out.println("Data Added Successfully");
        }
        catch (Exception e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }


    }
}
