public class String_Decision_Making {
    public static void main(String[] args)
    {
        String str = "Lenovo";
        String str1 = "Lenovo";
        String str2 = "LENOVO";
        String str3 = "lenovo";
        if (str == str1)
        {
            System.out.println("Congrats str & str1 Is Matched");
        }
        else
            System.out.println("Sorry str & str1 Didn't Match");
        if (str3 == str2)
        {
            System.out.println("Sorry str1 & str2 Didn't Match");
        }
        else
            System.out.println("Congrats str1 & str2 Is Matched");
    }
}
