package com.company.anonymous;

//Пример функционального интерфейса
//(поскольку в нем ровно один абстрактный метод)
public interface TextProcessingRule {
    //выполняет операцию над строкой и возвращает результат
    String process(String s);
}
