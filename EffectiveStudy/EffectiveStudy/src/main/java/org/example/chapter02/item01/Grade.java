package org.example.chapter02.item01;

public interface Grade {
    String toText();
}

class A implements Grade {

    @Override
    public String toText() {
        return "A";
    }
}

class B implements Grade {
    @Override
    public String toText() {
        return "B";
    }
}

class C implements Grade {
    @Override
    public String toText() {
        return "C";
    }
}

class D implements Grade {
    @Override
    public String toText() {
        return "D";
    }
}

class F implements Grade {
    @Override
    public String toText() {
        return "E";
    }
}

class GradeCalculator {

    public static Grade of(int score){
        if(score >= 90) return new A();
        else if(score >= 80) return new B();
        else if(score >= 70) return new C();
        else if(score >= 60) return new D();
        else return new F();
    }
}