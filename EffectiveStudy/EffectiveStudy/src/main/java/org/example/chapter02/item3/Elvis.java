package org.example.chapter02.item3;

public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {

    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding(){

    }
}
