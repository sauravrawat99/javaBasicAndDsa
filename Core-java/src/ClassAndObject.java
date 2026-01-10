public class ClassAndObject {
    public static void main(String[] args) {

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
