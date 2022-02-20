public class Operator_Associativity {
    public static void main(String[] args)
    {
        int Num1 = 10 / 2 * 5;
        int Num2 = 4 / 2 * 3 - 1;
        int Num3 = 4 / 2 - 3 + 1;
        int Num4 = (4 + 5) * (10 / 2 * 6);
        int Num5 = ((7 * 3) - (2 / 2) + 1);
        int Num6 = (((4 * 10 / 2 + 3) + (5 - 15 + 2)) + 3);
        int Num7 = 5 % 2 * 7 - 0 / 5 * 3 + 4;
        int val1;
        int val2;
        val1 = val2 =100;
        System.out.println("Num1 = "+Num1);
        System.out.println("Num2 = "+Num2);
        System.out.println("Num3 = "+Num3);
        System.out.println("Num4 = "+Num4);
        System.out.println("Num5 = "+Num5);
        System.out.println("Num6 = "+Num6);
        System.out.println("Num7 = "+Num7);
        System.out.println("Value1 Is: "+val1);
        System.out.println("Value2 Is: "+val2);
    }
}
