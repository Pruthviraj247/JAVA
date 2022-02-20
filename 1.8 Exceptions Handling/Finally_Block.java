public class Finally_Block {
    public static void main(String[] args)
    {
        try {
            int Num1 = 12;
            int Num2 = 0;
            int Total = Num1/Num2;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("Array Index Is Out Of Bounds Exception");
        }
        finally {
            System.out.println("Finally I'm Out");
        }



    }
}
