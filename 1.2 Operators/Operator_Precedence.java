public class Operator_Precedence {
    public static void main(String[] args)
    {
        int Num1 = 5 + 4 * 2;
        int Num2 = (5 + 2) * (4 - 1);
        int Num3 = ((7 + 1) / 4) * 2;
        int Num4 = (((4 + 1) * (3 - 1)) - 1) / (2 + 1);
        int Num5 = 8 * 2 / 4 - 1;
        System.out.println("Num1 Is: "+Num1);
        System.out.println("Num2 Is: "+Num2);
        System.out.println("Num3 Is: "+Num3);
        System.out.println("Num4 Is: "+Num4);
        System.out.println("Num5 Is: "+Num5);
    }
}
