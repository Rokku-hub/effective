package org.example.chapter02.item02;

public class ConvariantReturnType {


    /**
     *
     * @class : ConvariantReturnType
     *
     * @author : rokku
     * @version : 1.0.0
     * @date : 2024-01-12
     *
     * @params :
     * @return :
     *
     * TODO : KEYWORD = 공변 변환 타이핑
     *
     *
     **/

    public static void main(String args[]){
        T t = new T();
        t.getA();
        t.getB();
    }

    abstract static class Test {

        int a = 1;

        public int getA() {
            return  a;
        }

        abstract public Test ret();
    }

    static class T extends Test{

        int b = 2;

        public int getB() {
            return b;
        }

        @Override
        public T ret() {
            return new T();
        }
    }
}
