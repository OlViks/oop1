import java.sql.Struct;

public class Human {

    int age;
    String name;
    String city;

    Human(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;

    }

    void human() {
        System.out.println(name + "из города" + city + " , которому"
                + age + " лет");

    }
}
