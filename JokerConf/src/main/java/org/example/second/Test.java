package org.example.second;

////what will write next code?
public class Test {
    Byte value;

    byte getValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println(new Test().getValue());//// NPE <-answer, bc we didnt set non-prim value
    }

}
