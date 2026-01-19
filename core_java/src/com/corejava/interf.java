package core_java.src.com.corejava;
public class interf {
    public static void main(String[] args){
        J j= new L();
        j.show();
    }
}

interface J {
    void show();
}

interface K {
    void display();
}

class L implements J, K {
    public void show() {
        System.out.println("show");
    }

    public void display() {
        System.out.println("display");
    }
}

