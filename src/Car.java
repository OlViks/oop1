import java.util.Objects;

public class Car {
    String brand;
    String model;
    double volume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double volume, String color, int year, String country) {
        this.brand =Objects.requireNonNullElse(brand,"default") ;
        this.model = Objects.requireNonNullElse(model, "default");
        this.volume = Math.max(volume, 1.5);
        this.color =Objects.requireNonNullElse(color, "белый") ;
        this.year =Math.max(year, 2000) ;
        this.country =Objects.requireNonNullElse(country, "default") ;
    }

    void getOptions() {
        System.out.println("Марка автомобиля " + brand + " модель " + model +
                " год выпуска " + year + " цвет " + color +
                " объем двигателя " + volume + " L " + " страна производитель " +
                country + ".");
    }
}