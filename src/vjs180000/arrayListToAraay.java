package vjs180000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListToAraay {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String> ();
        list.add("a");
        list.add("b");

        String[] array = new String[list.size()];
        list.toArray(array);

        System.out.println(Arrays.toString(array));
        String[] array1 = {"a", "b"};
        List<String> list1 = Arrays.asList(array1);

        System.out.println(list1);
    }
}
