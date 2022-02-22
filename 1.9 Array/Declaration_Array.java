public class Declaration_Array {
    public static void main(String[] args)
    {
        int Num[] = {2,5,8,9,7,6};
        String Str[] = {"Hello","Hi","Tata","Bye Bye"};
        char chr[] = {'H','E','L','L','O'};
        Float Flt[] = {11.2f,53.12f,99.69f};
        for (int i : Num)
        {
            System.out.println(Num);
        }
        for (String S : Str)
        {
            System.out.println(Str);
        }
        for (char c : chr)
        {
            System.out.println(chr);
        }
        for (Float f : Flt)
        {
            System.out.println(Flt);
        }

    }
}
