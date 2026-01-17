package core_java.src.com.corejava;

public class classAndObject {

    public static void main(String[] args) {

        Animal animal = new Animal();   // object created
        animal.setName("Cow");
        animal.setAge(10);

        System.out.println(animal.getName());
        System.out.println(animal.getAge());

        // School object
        School s1 = new School();
        s1.setVillage("Magrora");
        s1.setId(101);
        s1.setName("Goverment school of ");
        // instanceof check
        System.out.println(s1);
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

class School {
    int id;
    String name;
    String village;

    void setId(int newid) {
        id = newid;
    }

    void setName(String newName) {
        name = newName;
    }

    void setVillage(String newVillage) {
        village = newVillage;
    }
    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", village='" + village + '\'' +
                '}';
    }
}

