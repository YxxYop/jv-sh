package org.yxx;

import java.util.Scanner;

public class Task5 {
    public static void printFigure(int s) {
        if (s < 3) {
            System.out.println("Invalid s");
            return;
        }

        for (int i = 0; i < s; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < s; j++) {

                if (i == 0 || i == s - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == s - 1) {
                    System.out.print("*");
                } else if (i == 1 || i == s - 2) {
                    System.out.print("#");
                } else if (j == 1 || j == s - 2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter S: ");
        printFigure(scanner.nextInt());
    }
}
