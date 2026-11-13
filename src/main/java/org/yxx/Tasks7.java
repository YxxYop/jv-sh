package org.yxx;

public class Tasks7 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 4, 3, 10, 8, 2, 3 };

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }

                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    if (i == j2) {
                        continue;
                    }

                    if (arr[i] == arr[j] + arr[j2]) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    break;
                }
            }

            if (found) {
                result++;
            }
        }

        System.out.println(result);
    }
}
