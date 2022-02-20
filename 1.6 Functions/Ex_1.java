import java.util.Scanner;

public class Ex_1 {
    static void myfun()
    {
        int Z,A,B,C;
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter The Value");
        int Num1 = Num.nextInt();
        System.out.println("Enter The Value");
        int Num2 = Num.nextInt();
        Z = Num1 + Num2;
        A = Num1 - Num2;
        B = Num1 * Num2;
        C = Num1 / Num2;
        System.out.println(" Your Total Is - "+"\n"+"Addition:"+Z+"\n"+ "Subtraction:"+ A+"\n"+ "Multiplication:"+ B+"\n"+ "Division:"+C);
    }
    public static void main(String[] args)
    {
        myfun();
    }
}
