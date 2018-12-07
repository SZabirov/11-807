package com.company.wrappers;

public class Main {
    public static void main(String[] args) {
        int i1 = 5;
        //Integer - класс-обертка для представления интов в виде объектов ссылочного типа
        Integer i2 = new Integer(5);
        //Еще одно назначения классов-оберток - доступ к статическим методам, облегчающим работу с интами
        int x = Integer.parseInt("42");

        Human h = new Human(null);

        Integer a = new Integer(4);
        Integer b = 4;//autoboxing == new Integer(4);
        int t = 5;
        Integer r = t;//autoboxing
        int y = r;//unboxing
    }
}











