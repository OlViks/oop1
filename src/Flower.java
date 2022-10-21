import java.util.Objects;

public class Flower {

    private final String flowerColor;
    private final String name;
    private final String country;
    private final double cost;
    int lifeSpan;

    Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor != null && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
        this.country = Objects.requireNonNullElse(country, "Россия");
        this.cost = Math.max(cost, 1);
        this.lifeSpan = Math.max(lifeSpan, 3);
        this.name = Objects.requireNonNullElse(name, "Введите название");
    }

    public void flower() {
        System.out.println("Название: " + name + " цвет " + flowerColor + " из " + country + " стоимость " + cost + " рублей "
                + " срок стояния " + lifeSpan + " дней");
    }
}