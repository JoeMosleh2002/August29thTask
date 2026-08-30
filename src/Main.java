import java.util.HashSet;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}

class Product {
    private String code;
    private double price;

    public Product(String code, double price) {
        this.code = code;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(code, product.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}

class CourseStudent {
    private int id;
    private String email;

    public CourseStudent(int id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseStudent that = (CourseStudent) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class Car {
    private String plateNumber;
    private String color;

    public Car(String plateNumber, String color) {
        this.plateNumber = plateNumber;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(plateNumber, car.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }
}

 class TaskImplementation {
    public static void main(String[] args) {
        Set<Person> peopleSet = new HashSet<>();
        peopleSet.add(new Person(1, "Ahmed"));
        peopleSet.add(new Person(1, "Ahmed"));
        peopleSet.add(new Person(2, "Osama"));

        System.out.println(peopleSet.size());

        HashMap<Person, String> employeeMap = new HashMap<>();
        Person p1 = new Person(101, "Ali");
        employeeMap.put(p1, "Manager");

        Person searchKey = new Person(101, "Ali");
        System.out.println(employeeMap.containsKey(searchKey));
        System.out.println(employeeMap.get(searchKey));

        p1.setId(999);
        System.out.println(employeeMap.containsKey(p1));
    }
}