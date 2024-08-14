package org.example.second;

import java.util.function.Function;

public class Main {
    //what that code will write?
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = (i) -> i * 3;
        Function<Integer, Integer> f2 = (i) -> i * i;
        Function<Integer, Integer> f3 = (i) -> i / 2;
        Integer result = f1.compose(f2).andThen(f3).apply(4);
        //                  (2)48      (1)16       (3)24 <- answer
        // why? because firstly will executed f1.compose(f2), f2 -> f1 -> f3. Why? because:
        /*
        The Function returned by compose() will first call the Function passed as parameter to compose(), and then it will call the Function which compose() was called on.
         */
        System.out.println(result);
        var res2 = f1.compose(f2).andThen(f3);
        var result2 = res2.apply(4);
        //                  (2)48      (1)16       (3)24 <- answer
        System.out.println(result2);
    }
}
