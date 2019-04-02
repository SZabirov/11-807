package com.company.bestawesomeframework;

import java.util.ArrayList;
import java.util.List;

public class SuperBestAwesomeFramework {
    public static <T> List<T> getMany(Class<T> aClass, int count) {
        List<T> list = new ArrayList<>();
        try {
            for (int i = 0; i < count; i++) {
                T newObj = aClass.newInstance();
                list.add(newObj);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return list;
    }

    //что, например, можно использовать:
    //получение всех конструкторов класса
    //получение типов параметров данных конструкторов
    //получение типов переданных параметров: у каждого можно вызвать getClass
    //В классе есть такой конструктор для передаваемых params
    public static <T> List<T> getMany(Class<T> aClass, int count, Object... params) {
        return null;
    }

}
