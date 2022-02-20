public class String_Index_Out_Of_Bound_Exception {
    public static void main(String[] args)
    {
        try {
            String a = "This Is A StringIndexOutOfBound Exception";
            System.out.println(a.length());//Length is 41
            char z = a.charAt(77);//  accessing 77th element
            System.out.println(z);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException");
        }


    }
}
