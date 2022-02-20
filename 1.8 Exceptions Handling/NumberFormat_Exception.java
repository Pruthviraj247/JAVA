public class NumberFormat_Exception {
    public static void main(String[] args)
    {
        try {
            String str = "This Is String";
            int Num = Integer.parseInt(str);

        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception");
        }
    }
}
