package com.company.hello;

public class Main {
    public static void main(String[] args) {
        HelloWorld hw = new EnglishHelloWorld();
        hw.hello();

        HelloWorld scarFaceHello = new HelloWorld() {
            @Override
            public void hello() {
                System.out.println("SAY HELLO TO MY LITTLE FRIEND!!!");
            }
        };
        scarFaceHello.hello();

        CoolHelloWorld chw = new CoolHelloWorld("downtown") {
            @Override
            public void showFingerSign() {
                System.out.println("Showing smth");
            }
        };

        chw.hello();
    }
}





