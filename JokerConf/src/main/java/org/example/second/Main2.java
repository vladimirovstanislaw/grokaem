package org.example.second;

//what will write next code?
public class Main2 {
    public static void main(String[] args) {
        boolean b = true;
        if (b = check()) {//we can assign value to variable inside if
            System.out.println("Always true");
        } else {
            System.out.println("Wont be printed");//will be printed
        }

    }

    private static boolean check() {
        return false;
    }

}
