package org.example.chapter02.item01;

import java.util.HashMap;
import java.util.Map;

public interface SmartPhone {
    static SmartPhone getPhone(int price){
        if(price > 1000000) return new IPhone();
        if(price > 50000) return new Galaxy();
        return new Huawei();
    }
}

class Galaxy implements SmartPhone {};
class IPhone implements SmartPhone {};
class Huawei implements SmartPhone {};

class SmartPhones {

    private static final Map<String,SmartPhone> phoneCash = new HashMap();
    static {
        phoneCash.put("samsung",getSamsungPhone());
        phoneCash.put("apple",getApplePhone());
        phoneCash.put("chines",getChinesePhone());
    }

    public static SmartPhone getSamsungPhone() {
        return new Galaxy();
    }

    public static SmartPhone getApplePhone() {
        return new IPhone();
    }

    public static SmartPhone getChinesePhone() {
        return new Huawei();
    }

}
