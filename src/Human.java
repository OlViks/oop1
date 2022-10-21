import java.util.Objects;

public class Human {

    int age;
    final String name;
    final String city;
    String jobTitle;

    Human(int age, String name, String city, String jobTitle) {
        this.age = Math.max(age, 0);
        this.name = Objects.requireNonNullElse(name, "Информация не указана.");
        this.city = Objects.requireNonNullElse(city, "Информация не указана.");
        this.jobTitle = Objects.requireNonNullElse(jobTitle,"Информация не указана.");
    }
    Human(int age, String name, String city) {
        this.age = Math.max(age, 0);
        this.name = Objects.requireNonNullElse(name, "Информация не указана.");
        this.city = Objects.requireNonNullElse(city, "Информация не указана.");
    }

    void human() {
        System.out.println("Привет! Меня зовут " + name + " Я из города" + city + " , Я родился в "
                + (2022 - age) + " году. Будем знакомы!");

    }

    void helloHuman() {
        System.out.println("Привет! Меня зовут " + name
                + ". Я из города "+ city + ". Я родился в " + (2022 - age) + " году."
                + " Я работаю на должности "+ jobTitle + ". Будем знакомы!");

    }

}
