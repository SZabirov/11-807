package com.company.equals;

public class PhoneNumber {
    private String code;
    private String number;

    public PhoneNumber() {
    }

    public PhoneNumber(String code, String number) {
        this.code = code;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        //покрывается следующим условием (излишне)
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof PhoneNumber)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PhoneNumber pn = (PhoneNumber) obj;
        return this.getCode().equals(pn.getCode()) &&
                this.getNumber().equals(pn.getNumber());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
