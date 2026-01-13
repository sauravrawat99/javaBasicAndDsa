package core_java.src.com.corejava;
// method overLoading

class Calculator {
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}

// method overriding
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
//        method overloading
        Calculator c = new Calculator();
        System.out.println(c.sum(10, 20));
        System.out.println(c.sum((float)10.5, (float)20.5));

//        method overRide

        Circle ci=new Circle();
        ci.draw();


    }
}
