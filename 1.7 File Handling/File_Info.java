import java.io.File;

public class File_Info {
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\pruthviraj\\Java_Main\\8_File_Handling\\src\\Main.txt");
        if (file.exists())
        {
            System.out.println("Taking File Name : "+file.getName());
            System.out.println("Taking File Path : "+file.getPath());
            System.out.println("Can File Read-bal : "+file.canRead());
            System.out.println("Can File Write-bal : "+file.canWrite());
            System.out.println("Can File Execute-bal : "+file.canExecute());
            System.out.println("Taking File Length : "+file.length());
            System.out.println("Taking File Hash Code : "+file.hashCode());
            System.out.println("Can File Total Space : "+file.getTotalSpace());
            System.out.println("Taking File Free Space : "+file.getFreeSpace());
            System.out.println("Compare To Anther File : "+file.compareTo(new File("C:\\Users\\pruthviraj\\Java_Main\\8_File_Handling\\src\\Main1.txt")));

        }
    }
}
