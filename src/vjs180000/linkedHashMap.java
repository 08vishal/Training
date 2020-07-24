package vjs180000;

import java.util.LinkedHashMap;
import java.util.Map;

//
//Create a linkedhashmap  pair of  key string value object of any type.,
// then extract only key , sort in natural order and merge with
// linkedhashmap with final result showing ordered pairs
public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lmap=new LinkedHashMap<> ();
        lmap.put( "N",1);
        lmap.put( "A",2);
        lmap.put( "B",3);
        lmap.put( "C",4);
        lmap.put( "F",5);

       // lmap.keySet().stream ().sorted (lmap.).forEachOrdered (x -> lmap.put(x.getKey(), x.getValue()));

        System.out.println (lmap);

    }
}
