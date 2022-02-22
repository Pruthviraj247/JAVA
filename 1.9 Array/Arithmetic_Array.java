public class Arithmetic_Array {
    public static void main(String args[])
    {
        int sum = 0;
        int sum1 = 1;
        int[] arr = {36,14,41,9};
        int len = arr.length;
        for (int i = 0; i<arr.length; i++)
        {
            sum = sum+arr[i];
            sum1 = sum1*arr[i];
        }
        double avg = sum/len;
        System.out.println("Sum of all the elements of an array: "+sum);
        System.out.println("Subtraction of all the elements of an array: "+sum1);
        System.out.println("average of all the elements of an array: "+avg);

    }
}
