public class Sum_Of_Array {
    public static void main(String args[])
    {
        int sum = 0;
        int[] arr = {36,14,41,9};
        for (int i = 0; i<arr.length; i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("Sum of all the elements of an array: "+sum);
    }
}
