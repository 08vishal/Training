package vjs180000;

public class wrapperClass {
    public static void main(String[] args) {
        int a=234;
        Integer i=Integer.valueOf(a);
        System.out.println(i+"  "+a);
        Integer b= 54;
        int c=b.intValue();
        System.out.println(c+"  "+b);
        System.out.println(i.equals(c));
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());

    }
}
