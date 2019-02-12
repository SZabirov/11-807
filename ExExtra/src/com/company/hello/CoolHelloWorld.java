package com.company.hello;

public abstract class CoolHelloWorld implements HelloWorld {
    String district;

    public CoolHelloWorld(String district) {
        this.district = district;
    }

    @Override
    public void hello() {
        System.out.println("wasssup" + " I'm from " + district);
    }

    public abstract void showFingerSign();
}
