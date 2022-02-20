import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args)
    {
        int i;
        System.out.println("How Many Number Coming In Deterrent Tables");
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter The Value");
        int Num1 = Num.nextInt();
        for (i=1; i<=10000; i++)
        {
            if (Num1%i==0)
                    System.out.println(i);
        }
    }
}
