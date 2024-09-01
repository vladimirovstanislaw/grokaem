package org.example.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Conference {
    public Conference() {
    }

    public void printName() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Joker", "2015", "2016"));
        list.stream().forEach(x -> {
            if (x.equals("2015")) {
                list.remove(x);
            }
        });
        System.out.println(list.stream().collect(Collectors.joining(" ")));
    }

}

class JokerConference extends Conference {
    private IntStream intStream = IntStream.of(2000, 10, 6);


    public void printName() {
        final int year[] = {0};
        intStream.parallel().peek(v -> year[0] += v).boxed().collect(Collectors.toList());
        if (year[0] == 2016) {
            System.out.println("SemipalatinskiiJoker " + year[0]);
        }

    }

    //Code must write "Joker 2016", why it doesn't? Answer: because we didn't call method
    public static void main(String[] args) {
        System.out.println("hello, anybody here?");
        new Conference().printName();
        new JokerConference().printName();

        System.out.println("literally, no");
    }
}

