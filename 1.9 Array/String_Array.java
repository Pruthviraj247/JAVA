public class String_Array {
    public static void main(String[] args)
    {
        String[] Mobile = {"I-Phone","Samsung","One-Plus"};
        for (int i =0; i<Mobile.length; i++)
        {
            System.out.println(Mobile[i]);
        }
        System.out.println("__________________________________________________________________________");
        System.out.println("Break of The First Loop");
        System.out.println("__________________________________________________________________________");
        for (String  j : Mobile)
        {
            System.out.println(j);
        }
    }
}
