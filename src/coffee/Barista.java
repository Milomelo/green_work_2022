package coffee;

class Baristaa {
    String baristaaName() {
        return "";
    }
}

class 공유 extends Baristaa {
    String name = "공유";

    public String baristaaName() {
        return name;
    }

}

public class Barista {
    Baristaa gong = new 공유();

    public Coffee makeCoffee(MenuItem menuItem) {

        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}