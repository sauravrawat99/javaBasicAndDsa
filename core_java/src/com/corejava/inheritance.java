package core_java.src.com.corejava;
//single inheritance
class Parent {
int money = 1000;

void house() {
    System.out.println("Parent House");
}
}

class Child extends Parent {
    void bike() {
        System.out.println("Child Bike");
    }
}

class A{
    void a(){
        System.out.println("A");
    }
}

class B extends A{
    void b(){
        System.out.println("B");
    }
}

class C extends B{
    void c(){
        System.out.println("C");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.house();
        ch.bike();
        System.out.println(ch.money);

        C obj = new C();
        obj.a();
        obj.b();
        obj.c();

    }
}

