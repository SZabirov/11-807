package com.company.annotationexample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;

public class Configurer {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<MyNotepadUser> aClass =
                MyNotepadUser.class;
        MyNotepadUser user = new MyNotepadUser("Наталья");
        Field[] allFields = aClass.getDeclaredFields();
        for (Field f : allFields) {
            Annotation[] annotations =
                    f.getAnnotations();
            for (Annotation a : annotations) {
                if (a.annotationType().equals(InjectImpl.class)) {
                    String interfaceName = f.getType().getTypeName();
                    String className = interfaceName + "Impl";
                    Class c = Class.forName(className);
                    Object instanceToInject = c.newInstance();
                    f.setAccessible(true);
                    f.set(user, instanceToInject);
                }
            }
        }
        user.writeSomething(3);
    }
}
