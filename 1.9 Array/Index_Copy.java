public class Index_Copy {
    public static void main(String args[])
    {
        char str[] = {'H','I','D','O','Y','O','U','C','O','P','Y','M','Y','C','O','D','E','?',};
        char[] str1 = new char[4];
        System.arraycopy(str,7,str1,0,4);
        System.out.println(String.valueOf(str1));
    }
}
