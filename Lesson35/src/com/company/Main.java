package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<SimpleStudent> aClass =
                SimpleStudent.class;
        Method m = aClass
                .getDeclaredMethod("passExam", String.class);
        m.setAccessible(true);
        SimpleStudent simpleStudent =
                new SimpleStudent();
        simpleStudent.setName("Наталья");
        m.invoke(simpleStudent, "алгем");
    }
}
