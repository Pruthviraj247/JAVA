import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args)
    {
        int i;
        int Sum = 0;
        Scanner Num = new Scanner(System.in);
        System.out.println("How Many Time Do You Want To Addition");
        int Num1 = Num.nextInt();
        for (i=1;i<=Num1;i++)
        {
            System.out.println("Enter The Number");
            int Num2 = Num.nextInt();
            Sum = Sum+Num2;

        }
        System.out.println("Your Addition Is: "+Sum);
    }
}
