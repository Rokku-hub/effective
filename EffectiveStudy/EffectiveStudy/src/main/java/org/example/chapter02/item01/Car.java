package org.example.chapter02.item01;

public class Car {

    private String brand;
    private String color = "black";

    private Car(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public static Car brandBlackFrom(String brand){
        return new Car(brand, "black");
    }

    public static Car brandColorOf(String brand, String color){
        return new Car(brand, color);
    }
}
