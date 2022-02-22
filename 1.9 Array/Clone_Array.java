public class Clone_Array {
    public static void main(String args[])
    {
        int [] arr = {9,8,7,6};
        System.out.println("This Is Main Array");
        for (int i=0; i<4; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("This Is Clone Array");
        int clo[] = arr.clone();
        for (int j=0; j<4; j++)
        {
            System.out.println(clo[j]);
        }
        if (arr == clo)
        {
            System.out.println("There Are Equal Array");
        }
        else
            System.out.println("This Array Is Not Equal");
    }
}
