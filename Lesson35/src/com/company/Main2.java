package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<SimpleStudent> aClass =
                SimpleStudent.class;
        Method m = aClass
                .getDeclaredMethod("passExam", String.class, Integer.class);
        //два способа получить метод с параметрами String и int:
//        Method m = aClass
//                .getDeclaredMethod("passExam", String.class, Integer.TYPE);
//        Method m = aClass
//                .getDeclaredMethod("passExam", String.class, int.class);
        m.setAccessible(true);
        SimpleStudent simpleStudent =
                new SimpleStudent();
        simpleStudent.setName("Наталья");
        m.invoke(simpleStudent, "алгем", 3);
    }
}
