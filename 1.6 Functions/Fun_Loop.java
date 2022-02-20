public class Fun_Loop {
    static void myfun()
    {
        int i=0;
        while (i<=3)
        {
            System.out.println("\t\t\tI Am In Loop");
            break;
        }

    }
    public static void main(String[] args)
    {
        myfun();
        System.out.println("End of First");
        System.out.println("Start Second");
        myfun();
        System.out.println("End of Second");
    }
}
