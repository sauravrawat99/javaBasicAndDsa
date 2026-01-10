package core_java.src.com.corejava;
//default contractor
class Men {
    String name;
    int age;

    Men() {
        name = "Unknown";
        age = 0;
    }
}
//promise constructor
class Women {
    String name;
    int age;

    Women(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
//shallow copy constructor
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Village {
    String name;
    Address address;

    Village(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow Copy
    Village(Village V) {
        this.name = V.name;
        this.address = V.address;
    }
}


//deep copy
class Location {
    String city;

    Location(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Location location;

    Person(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    // Deep Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.location = new Location(p.location.city);
    }
}

//constructor overload
class Car {
    String name;
    int age;

    Car() {
        name = "NA";
        age = 0;
    }

    Car(String name) {
        this.name = name;
    }

    Car(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
