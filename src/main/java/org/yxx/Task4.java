package org.yxx;

import java.util.Scanner;

public class Task4 {
    public static boolean isValid(int n) {
        n = Math.abs(n);

        if (n == 0) {
            return false;
        }

        int even = 0;
        int odd = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            n /= 10;
        }

        return even == odd;
    }

    public static long sum(int A, int B) {
        int start = Math.min(A, B);
        int end = Math.max(A, B);

        long sum = 0;

        for (int i = start; i <= end; i++) {
            if (isValid(i)) {
                sum += i;
            }
        }

        return sum;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.println(sum(a,b));
    }
}
