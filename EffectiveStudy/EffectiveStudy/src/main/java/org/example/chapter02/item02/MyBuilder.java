package org.example.chapter02.item02;

public class MyBuilder {

    /**
     *
     * @class : MyBuilder
     *
     * @author : rokku
     * @version : 1.0.0
     * @date : 2024-01-12
     *
     * @params :
     * @return :
     *
     **/
    public static void main(String args[]){
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL).
                addTopping(Pizza.Topping.SAUSAGE).
                addTopping(Pizza.Topping.ONION).
                build();

        Calzone calzone = new Calzone.Builder().
                addTopping(Pizza.Topping.HAM).
                sauceInside().
                build();



    }


}
