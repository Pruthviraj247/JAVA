import java.util.Scanner;

public class Lader {
    public static void main(String[] args)
    {
        Scanner Num= new Scanner(System.in);
        System.out.println("Enter Your Age");
        int Num1 = Num.nextInt();
        if (Num1 <= 6)
            System.out.println("Sorry You Are Just Kid");
        else if (Num1 < 18)
            System.out.println("Sorry You Not Able To Drive");
        else if (Num1 == 18)
            System.out.println("Please Come To The Driving office");
        else if (Num1 <=100)
            System.out.println("Yes You Are The To Drive");
        else
            System.out.println("Sorry License Has Been Expire & In Future You Are Not Able To Drive");
    }
}
