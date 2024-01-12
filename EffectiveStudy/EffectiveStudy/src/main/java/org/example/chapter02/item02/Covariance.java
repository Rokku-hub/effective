package org.example.chapter02.item02;

import java.util.Collection;
import java.util.Objects;

public class Covariance {

    /**
     *
     * @class : Covariance
     *
     * @author : rokku
     * @version : 1.0.0
     * @date : 2024-01-12
     *
     * Integer 는 Object 하위 타입 즉 공변이지만
     * 제네릭은 공벼인 아니다
     * ex ) List<Integer> != List<Object> 불공변성
     *
     **/
    public static void main(String args[]){

    }

    void printCollection(Collection<? extends MyParent> c){

        /*for(MyChild e : c){
            System.out.println(e);
        }*/

        for(MyParent e : c){
            System.out.println(e);
        }

        for(MyGrandparent e : c){
            System.out.println(e);
        }

        for(Object e : c){
            System.out.println(e);
        }
    }
}

class MyGrandparent {

}

class MyParent extends MyGrandparent {

}

class MyChild extends MyParent {

}

class AnotherChild extends MyParent {

}
