public class ArrayIndexOutOfBounds_Exception {
    public static void main(String[] args)
    {
        try {
            int [] Arr =  {1,2,3,4,5};
            Arr[24] = 5; // Taking 25th element But Aur Size Array Is: 13

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("Array Index Is Out Of Bounds Exception");
        }
    }
}
