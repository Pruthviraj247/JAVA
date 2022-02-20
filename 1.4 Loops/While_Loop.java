import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args)
    {
        System.out.println("Program of Multiplication Table");
        Scanner Num = new Scanner(System.in);
        int Count = 1;
        System.out.println("Enter The Value");
        int Number = Num.nextInt();
        while (Count<=10)
        {
            System.out.println(Number+" X "+Count+" = "+Number*Count);
            Count++;
        }
    }
}
