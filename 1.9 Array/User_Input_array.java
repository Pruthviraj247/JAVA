import java.util.Scanner;

public class User_Input_array {
    public static void main(String args[])
    {
        Scanner New = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int num = New.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<num; i++)
        {
            System.out.println("Enter The Value");
             arr[i] = New.nextInt();
        }
        System.out.println("You Entered Value Is: ");
        for (int i : arr)
        {
            System.out.println(i);
        }
        System.out.println("Your Value Successfully Store In Array");
    }
}
