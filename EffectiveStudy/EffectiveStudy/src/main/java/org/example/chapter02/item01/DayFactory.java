package org.example.chapter02.item01;


import java.util.HashMap;
import java.util.Map;

class Day {
    private String day;

    public Day(String day) {this.day = day;}

    public String getDay() {return day;}
}

class DayFactory {

    private static final Map<String, Day> cache = new HashMap<>();
    static {
        cache.put("Monday", new Day("Monday"));
        cache.put("Tuesday", new Day("Tuesday"));
        cache.put("Wednesday", new Day("Wednesday"));
    }

    public static Day from(String day){
        if(cache.containsKey(day)){
            System.out.println("해당 요일은 캐싱되어 있습니다.");
            return cache.get(day);
        }else{
            System.out.println("해당 요일은 캐싱되어 있지 않아 새로 생성하였습니다.");
            Day d = new Day(day);
            cache.put(day, d);
            return d;
        }
    }
}
