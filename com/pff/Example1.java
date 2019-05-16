package com.pff;

public class Example1 {

    double func(double x) {
        try {
            return func2(x, x - 1) / x;
        } catch (ArithmeticException e) {
            System.out.println("Zero dividing!");
            return 0;
        }
    }

    double func2(double a, double b) {
        return Math.cos(a) / b;
    }

    public static void main(String[] args) {
        Example1 ex1 = new Example1();
        double y = ex1.func(0);
        double z = ex1.func(1);
    }
}
