public class String_Addition_of_String {
    public static void main(String[] args)
    {
        int count = 0;
        String str  = "This Is A String";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            count++;
        }
        System.out.println("The Length of The String Is: "+count);
    }
}
