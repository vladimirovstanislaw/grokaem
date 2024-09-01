package org.example.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main5 {
    public static void main(String[] args) {
        //ArrayList<Integer> foo = new CopyOnWriteArrayList<>(); //not compiled
        List<Integer> foo = new CopyOnWriteArrayList<>();
        foo.addAll(Arrays.asList(1, 2, 3, 4));
        System.out.println(foo);

    }
}
