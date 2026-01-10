package core_java.src.com.corejava;
public class getterSetterThisDemo {
    public static void main(String[] args) {

        Teacher s1 = new Teacher();

        s1.setName("Amit");
        s1.setAge(21);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}

class Teacher {
    private String name;
    private int age;

    // Setter
    void setName(String name) {
        this.name = name;   // this keyword
    }

    void setAge(int age) {
        this.age = age;     // this keyword
    }

    // Getter
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}
