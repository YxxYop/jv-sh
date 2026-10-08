package org.yxx;

import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("m: ");
        int m = scanner.nextInt();

        if (n < 1 || m < 1) {
            System.out.println("0 teams");
            return;
        }

        int teams = Math.min(Math.min(n, m), (n + m) / 3);

        System.out.println(teams);

    }
}
