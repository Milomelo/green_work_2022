package coffeeshop;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        // 0.
        Customer customer = new Customer();
        Barista barista = new Barista();

        MenuItem m1 = new MenuItem("", 1500);
        MenuItem m2 = new MenuItem("", 2000);
        MenuItem m3 = new MenuItem("", 3000);
        MenuItem m4 = new MenuItem("", 4000);
        List<MenuItem> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        Menu menu = new Menu(list);

        // 1.
        // customer.order("", menu, barista);
    }

}