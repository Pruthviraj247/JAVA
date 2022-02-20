import java.util.Scanner;

public class Switch_2 {
    public static void main (String[] args)
    {
        Scanner Num = new Scanner(System.in);
        System.out.println("Press 1 For Squares Press 2 For Cubes Press 3 For Even Odd");
        System.out.println("Enter You Choice");
        int Num1 = Num.nextInt();
        System.out.println("Enter The Value");
        int Num2 = Num.nextInt();
        switch (Num1)
        {
            case 1:
                int Num3 = Num2 * Num2;
                System.out.println("The Square of "+Num2+" Is: "+Num3);
                break;
            case 2:
                int Num4 = Num2 * Num2 * Num2;
                System.out.println("The Cubes of "+Num2+" Is: "+Num4);
                break;
            case 3:
                if (Num2 % 2 == 0)
                {
                    System.out.println(Num2+" Is Even Number");
                }
                else
                    System.out.println(Num2+" Is ODD Number");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
