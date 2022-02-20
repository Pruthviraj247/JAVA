import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class String_Methods {
    public static void main(String[] args)
    {
        String str = "Hello This Is A String";
        System.out.println("The length of str Is: "+str.length());
        System.out.println("Substring Index 16 Is: "+str.substring(16));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.startsWith("H"));
        System.out.println(str.charAt(0));
        System.out.println(str.replace("Hello","Hi"));
        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(str.hashCode());
        System.out.println(str.chars());
    }
}
