package com.company.staticexample;

//поскольку нет модификатора public, то недоступен вне пакета staticexample
class Calculator {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }
}
