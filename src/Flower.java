public class Flower {

    private String flowerColor;
    private String title;
    private String country;
    private float cost;
    private int lifeSpan;

    public Flower(String title, String flowerColor, String country, float cost, int lifeSpan) {
        setTitle(title);
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public void flower() {
        System.out.println("Название: " + title + " цвет " + flowerColor + " из " + country + " стоимость " + cost + " рублей "
                + " срок стояния " + lifeSpan + " дней");
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "России";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost != 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public int setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan > 0 ? lifeSpan : 3;
        return this.lifeSpan;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
