import java.util.Scanner;

public class EX_1 {
    public static void main(String[] args)
    {
        int i;

        System.out.println("Program To Guess Number");
        Scanner Num = new Scanner(System.in);

        for (i=0;;i++)
        {
            System.out.println("Enter The Value");
            int Num1 = Num.nextInt();
            if (Num1 <=10)
            {
                System.out.println("You Win");
                break;
            }
            else
                System.out.println("Try Again");
                continue;
        }

    }
}
