import java.util.Scanner;

public class Nested_If {
    public static void main(String[] args)
    {
        Scanner Num= new Scanner(System.in);
        System.out.println("Enter The Value");
        int Num1 = Num.nextInt();
        if (Num1 <= 10)
        {
            System.out.println("Your Age Is Less Then 10");
            if (Num1 <= 7)
                System.out.println("Ohh Age Is Less Then 7 Also");
            if (Num1 <= 5)
                System.out.println("Ohh My You Age Is Less Then 5 You Are Just A Kid");
        }

        else
            System.out.println("Your Age Is Above 10");
    }
}
