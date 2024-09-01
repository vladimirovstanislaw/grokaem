package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = Stream.of(1, 2, 3, 4)
                .peek(x -> x = x + 1)
                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(result);
    }
}