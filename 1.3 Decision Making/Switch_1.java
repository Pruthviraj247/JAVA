import java.util.Scanner;

public class Switch_1 {
    public static void main (String[] args)
    {
        Scanner Num = new Scanner(System.in);
        System.out.println("Press\t 1 For Addition\t 2 For Subtraction\t 3 For Multiplication\t 4 For Division\t");
        System.out.println("Enter You Choice");
        int Num1 = Num.nextInt();
        System.out.println("Enter The First Value");
        int Num2 = Num.nextInt();
        System.out.println("Enter The Second Value");
        int Num3 = Num.nextInt();
        switch (Num1)
        {
            case 1:
                int Num4 = Num2 + Num3;
                System.out.println("Your Addition Is: "+Num4);
                break;
            case 2:
                int Num5 = Num2 - Num3;
                System.out.println("Your Subtraction Is: "+Num5);
                break;
            case 3:
                int Num6 = Num2 * Num3;
                System.out.println("Your Multiplication Is: "+Num6);
                break;
            case 4:
                int Num7 = Num2 / Num3;
                System.out.println("Your Division Is: "+Num7);
                break;
            default:
                System.out.println("Wrong Input");

        }
    }
}
