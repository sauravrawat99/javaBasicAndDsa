package core_java.src.com.corejava;
public class classAndObject {
    static void main(String[] ignoredArgs) {

        Animal animal = new Animal();   // object created

        animal.setName("Cow");          // set value
        animal.setAge(10);

        System.out.println(animal.getName());
        System.out.println(animal.getAge());
    }
}

class Animal {
    private String name;
    private int age;

    void setName(String newName) {
        name = newName;
    }

    void setAge(int newAge) {

        age = newAge;
    }

    String getName() {

        return name;
    }

    int getAge() {
        return age;
    }
}
