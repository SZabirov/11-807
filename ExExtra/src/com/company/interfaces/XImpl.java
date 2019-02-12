package com.company.interfaces;

public class XImpl implements X {
    static int x = 23;
    int c;

    //статический блок инициализации
    static {
        x = 42;
    }

    {
        c = 42;
    }

    @Override
    public void m() {
    }

//    IdCard[] cards;
//
//    public XImpl(Employee[] employees) {
//        //hides
//        IdCard cards = new IdCard[employees.length];
//        for (int i = 0; i < employees.length; i++) {
//            cards[i] = employees[i].getIdCard();
//        }
//        this.cards = cards;
//    }
//
//    void showEmployees(Set<Employee> employeeSet) {
//        for (Employee e : employeeSet) {
//            IdCard ic = e.getIdCard();
//            int n = ic.getNumber();
//        }
//    }
}
