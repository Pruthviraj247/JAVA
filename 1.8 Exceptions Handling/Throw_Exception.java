public class Throw_Exception {
    public static void main(String[] args)
    {
        int Num = 21;
        if (Num > 18)
        {
            throw new ArithmeticException("You Are Not Able Vote");
        }
        else
            System.out.println("You Are Able To Vote");
    }
}
