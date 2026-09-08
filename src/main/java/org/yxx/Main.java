package org.yxx;

public class Main {

    public static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }


    static void main() {
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(3));
        System.out.println(factorial(2));
        System.out.println(factorial(1));
        System.out.println(factorial(0));
    }
}
