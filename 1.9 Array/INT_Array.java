public class INT_Array {
    public static void main(String[] args)
    {
        int Num[]  = new int[5];
        Num[0] = 50;
        Num[1] = 40;
        Num[2] = 30;
        Num[3] = 20;
        Num[4] = 10;

        for (int i = 0; i<Num.length; i++)
        {
            System.out.println(Num[i]);
        }
        System.out.println("__________________________________________________________________________");
        System.out.println("Break of The First Loop");
        System.out.println("__________________________________________________________________________");
        for (int j : Num)
        {
            System.out.println(j);
        }
        System.out.println("The Length of Array Is: "+Num.length);
    }
}
