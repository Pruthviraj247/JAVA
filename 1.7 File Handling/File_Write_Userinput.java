import java.io.*;
import java.util.Scanner;

public class File_Write_Userinput {
    public static void main(String[] args)
    {
        Reader user = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(user);
        String str = null;
        try {
            System.out.println("Enter The Value");
            str = br.readLine();
            PrintWriter writer = new PrintWriter("C:\\Users\\pruthviraj\\Java_Main\\8_File_Handling\\src\\User Input.txt");
            writer.print(str);
            writer.close();

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
