package com.google.ievochko.deriving;

public class Derived extends Base {
    public static void show() {
        System.out.println("derived");
    }

    @Override
    public Integer signature(Number n) throws ArithmeticException {
        return 0;
    }

    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }
}
