import java.io.FileNotFoundException;

public class MultipleCatch {
    public static void main(String[] args)
    {
        try {
            int [] Arr =  {1,2,3,4,5};
            Arr[24] = 5/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception");
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("Array Index Is Out Of Bounds Exception");
        }

    }
}
