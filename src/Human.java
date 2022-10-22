import java.time.LocalDate;
import java.util.Objects;

public class Human {

    private int birthYear;
    final String name;
    private String city;
    String jobTitle;

    Human(int age, String name, String city, String jobTitle) {
        this.birthYear = Math.max(age, 0);
        this.name = Objects.requireNonNullElse(name, "«Информация не указана»");
        this.city = Objects.requireNonNullElse(city, "«Информация не указана»");
        this.jobTitle = Objects.requireNonNullElse(jobTitle, "«Информация не указана»");
    }

    Human(int age, String name, String city) {
        this.birthYear = Math.max(age, 0);
        this.name = Objects.requireNonNullElse(name, "«Информация не указана»");
        this.city = Objects.requireNonNullElse(city, "«Информация не указана»");
    }

    void human() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + " . Я родился в "
                + getAge() + " году. Будем знакомы!");

    }

    void helloHuman() {
        System.out.println("Привет! Меня зовут " + name
                + ". Я из города " + city + ". Я родился в " + getAge() + " году."
                + " Я работаю на должности " + jobTitle + ". Будем знакомы!");

    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void setAge(int age) {
        this.birthYear = Math.max(age, 0);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty()) {
            this.city = city;
        } else {
            this.city = "«Информация не указана»";
        }
    }
}
