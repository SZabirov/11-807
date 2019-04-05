package com.company;

public class SimpleStudent {
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private void passExam(String exam) {
        System.out.println(exam + " сдал на изи, всё списал," +
                "препод ваще не палил");
        System.out.println("Кстати, меня зовут " + name);
    }


    private void passExam(String exam, int countOfTry) {
        System.out.println(exam + " сдал c " + countOfTry +
                " раза, думал отчислят)))");
    }

    private void passExam(String exam, Integer mark) {
        System.out.println(exam + " сдал, получил " + mark);
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
