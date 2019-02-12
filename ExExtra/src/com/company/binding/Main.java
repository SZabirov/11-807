package com.company.binding;

class TestPrinter {
    //static binding example
    public static void main(String[] args) {
        A b = new B();
        Printer p = new Printer();
        p.print(b);
    }
}







//dynamic binding example
public class Main {
    public static void main(String[] args) {
        A b = new B();
        b.m();
    }
}
