import java.util.Scanner;

public class Secend_Fun {
    static void myfun(int Num2)
    {
        int Sum = 0;
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter The Value");
        int Num1 = Num.nextInt();
        Sum = Num1 + Num2;
        System.out.println("Your Addition Is: "+Sum);
    }
    public static void main(String[] args)
    {
        myfun(5);
    }
}
