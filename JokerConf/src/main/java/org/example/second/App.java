package org.example.second;

import java.util.Arrays;

////what will write next code?
public class App {
    final int[] arr;

    public App() {
        this.arr = new int[]{1, 0};
        this.arr[1] = 2;

    }

    static App instance;

    public static void main(String[] args) {
        new Thread(() -> instance = new App()).start();
        while (instance == null) {

        }
        System.out.println(Arrays.toString(instance.arr));// [1, 2] <- answer
    }
}
