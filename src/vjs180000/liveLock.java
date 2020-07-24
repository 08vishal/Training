package vjs180000;
class worker{
    private String name;
    private boolean active;

    public worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive(){
        return active;
    }

    public synchronized void work(commonResource cmonResource, worker otherworker){
        while (active){
           if(cmonResource.getOwner()!=this){
               try {
                   wait (10);
               }catch (InterruptedException e){

               }
               continue;

           }
           if(otherworker.isActive ()){
               System.out.println (getName ()+" : handing over the resource to the worker:"+ otherworker.getName ());
               cmonResource.setOwner(otherworker);
               continue;
           }
            System.out.println(getName() + ": working on the common resource");
            active = false;
            cmonResource.setOwner(otherworker);
        }
    }
}
class commonResource{
    private worker owner;
    public commonResource(worker a){
        owner=a;

    }
    public worker getOwner(){
        return owner;

    }
    public synchronized  void  setOwner(worker d){
        owner=d;
    }
}
public class liveLock {
    public static void main(String[] args) {
        final worker w1=new worker ("w1",true);
        final worker w2= new worker("w2",true);
        final commonResource s= new commonResource (w1);
        new Thread (()->{
            w1.work (s,w2);
        }).start ();
        new Thread (()->{
            w2.work(s,w1);
        }).start();

    }

}

