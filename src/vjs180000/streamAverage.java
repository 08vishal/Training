package vjs180000;

import java.util.ArrayList;

class Person{
    private int age;
    private String name;
    private int price;

    public Person(int age, String name, int price) {
        this.age = age;
        this.name = name;
        this.price = price;
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

public class streamAverage {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<> ();
        //ArrayList<Person> list1=new ArrayList<> ();
        list.add (new Person (1,"aniket",1000));
        list.add (new Person (2,"aniket1",2000));
        list.add (new Person (3,"aniket2",3000));
        list.add (new Person (4,"aniket3",4000));
        list.add (new Person (5,"aniket4",5000));
       System.out.println ( list.stream ().filter (person -> person.getPrice ()>2500).mapToInt (person->person.getPrice ()).summaryStatistics ().getAverage ());
        System.out.println ( list.stream ().filter (person -> person.getPrice ()>2500).mapToInt (person->person.getPrice ()).summaryStatistics ().getMax ());
        System.out.println ( list.stream ().filter (person -> person.getPrice ()>2500).mapToInt (person->person.getPrice ()).summaryStatistics ().getMin ());
         }
}
