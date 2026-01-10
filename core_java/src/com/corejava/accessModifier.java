package core_java.src.com.corejava;
public class accessModifier{
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Rahul");
        s1.setAge(20);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}

class Student {
    private String name;   // private variable
    private int age;

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
