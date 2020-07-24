package vjs180000;
class A
{
    int i=10;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
class B
{
    int i=20;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
public class deadlockThread {
    public static void main(String[] args) {
        A a=new A();
        B b= new B();

//        Thread 1
        Runnable t1=new Runnable () {
            @Override
            public void run() {
                synchronized (b){               // order is important for resolving thread deadlock
                    try {
                        Thread.sleep (1000);
                    }catch (Exception e) {
                        e.printStackTrace ();
                    }
                    synchronized (a){
                        System.out.println ("in block 1");
                    }

                }

            }
        };
        // thread 2
        Runnable t2=new Runnable () {
            @Override
            public void run() {
                synchronized (b){
                    synchronized (a){
                        System.out.println ("In block 2");
                    }
                }
            }
        };

        new Thread(t1).start ();
        new Thread (t2).start ();
    }
}
