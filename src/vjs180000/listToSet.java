package vjs180000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Emplyoee{
    private int age;
    private String name;
    private int price;

    public Emplyoee(int age, String name, int price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }
    @Override
    public boolean equals(Object x){
        Emplyoee obj=(Emplyoee)x;
        if(this.getName().equals(obj.getName()))
        {
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {

        //System.out.println("in hash code");
        //System.out.println(" value is "+Integer.valueOf(name.charAt(0)));
        return (int)name.hashCode();
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
public class listToSet {
    public static void main(String[] args) {
        List<Emplyoee> productsList = new ArrayList<Emplyoee> ();

        //Adding Products
        productsList.add(new Emplyoee (1,"jeff",25000));
        productsList.add(new Emplyoee (2,"bill",30000));
        productsList.add(new Emplyoee (3,"mukesh",28000));
        productsList.add(new Emplyoee (4,"elon",28000));
        productsList.add(new Emplyoee (5,"messi",90000));
        productsList.add(new Emplyoee (5,"messi",80000));
        Set<Emplyoee> productPriceList = productsList.stream()
                .map(p -> new Emplyoee (p.getAge (), p.getName(), p.getPrice()))
                .collect(Collectors.toSet());
        productPriceList.forEach (i->System.out.println (i.getPrice ()));
    }
}
