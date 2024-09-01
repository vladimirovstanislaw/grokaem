package org.example.second;

import java.util.ArrayList;
import java.util.List;

////what will write next code?
public class Container<T extends Number> {//generic automaticly discarded all type inside all generic fields, including stricly defined
    List<Integer> refs = new ArrayList<>();
    List<String> refsS = new ArrayList<>();

    {
        refs.add(1);
        refs.add(2);
        refs.add(3);
        refsS.add("123");
        refsS.add("213");
        refsS.add("124324");
    }       //Arrays.asList(1, 2, 3);

    public static void main(String[] args) {
        Container container = new Container();
//        for (Integer i : container.refs) { //compile error <-answer
//            System.out.println(i);
//        }
//        for (String i : container.refsS) { //compile error <-answer
//            System.out.println(i);
//        }
    }
}
