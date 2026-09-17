package org.yxx;

import java.util.Scanner;

public class Task3 {


    public static final VerticalParabola P1 =
            new VerticalParabola(2, 3, -0.5);

    public static final Rectangle R1 =
            new Rectangle(-6, 3, -1, 2);


    public static SimpleColor getColor(double x, double y) {
        boolean belowParabola = P1.isPointBelowParabola(x, y);
        boolean insideRectangle = R1.contains(x, y);

        if (belowParabola && insideRectangle) {
            return SimpleColor.GRAY;
        }

        if (belowParabola && y > R1.yMax) {
            return SimpleColor.BLUE;
        }

        if (belowParabola) {
            return SimpleColor.WHITE;
        }

        return SimpleColor.YELLOW;
    }


    public static void printColorForPoint(double x, double y) {
        System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
    }


    static void main(String[] args) {
        printColorForPoint(0, 4);
        printColorForPoint(2, 1);
        printColorForPoint(2, 2.5);
        printColorForPoint(4, 0);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input X: ");
        double x = scanner.nextDouble();

        System.out.print("Input Y: ");
        double y = scanner.nextDouble();
        if ((x < -10 || x > 10) && (y < -10 || y > 10)) {
            System.out.println("invalid x && y");
            return;
        }

        printColorForPoint(x, y);
    }
}