public class Arithmetic_exception {
    public static void main(String[] args)
    {
        try {
            int Num1 = 12;
            int Num2 = 0;
            int Total = Num1/Num2;
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException");
            System.out.println ("ZERO(0) is Never Divide By Any Number");
        }
    }
}
