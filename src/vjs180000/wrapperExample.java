package vjs180000;

public class wrapperExample {
    static int num;
    static String str;
    static {
        num=987;
        str="staticblockstring";
    }
    static void disp(){
        System.out.println(num);
        System.out.println(str);

    }

    public static void main(String[] args) {
        disp();

    }
}
