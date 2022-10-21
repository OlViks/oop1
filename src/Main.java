public class Main {
    public static void main(String[] args) {
        talk_1();
        talk_2();
        talk_3();
        talk_4();

    }


    private static void talk_1() {
        Human maksim = new Human(35, " Максим", " Минск");
        Human ana = new Human(-29, " Аня", " Москва");
        Human kate = new Human(28, null, " Калининград");
        Human artem = new Human(35, " Артем", " Москва");

        maksim.human();
        ana.human();
        kate.human();
        artem.human();
        System.out.println();
    }

    private static void talk_2() {
        Human maksim = new Human(35, " Максим", " Минск", "бренд-менеджером");
        Human ana = new Human(29, " Аня", " Москва", "методистом образовательных программ");
        Human kate = new Human(28, " Катя", " Калининград","продакт-менеджером");
        Human artem = new Human(35, " Артем", " Москва","директором по развитию бизнеса");
        maksim.helloHuman();
        ana.helloHuman();
        kate.helloHuman();
        artem.helloHuman();
        System.out.println();

    }

    private static void talk_3() {

    Car granta = new Car("Lada", "Granta", 1.7d, "Желтый", 2015, "Россия");
    Car audi = new Car("Audi", "A8", 50.0d, "", 2020, "Германия");
    Car bmw = new Car("BMW", "Z8", 3.0d, "Черный", 2021, "Германии");
    Car kia = new Car("Kia", "Sportage", 2.4d, "Красный", 2018, "");
    Car hyundai = new Car("Hyundai", "Avante", 0, "Оранжевый", 0, "Южной Корее");

    granta.getOptions();
    audi.getOptions();
    bmw.getOptions();
    kia.getOptions();
    hyundai.getOptions();
    System.out.println();

    }

    private static void talk_4() {

    }

}

