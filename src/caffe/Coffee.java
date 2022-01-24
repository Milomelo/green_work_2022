package caffe;

import java.awt.MenuItem;

public class Coffee {

    private String name;
    private int price;

    public Coffee(MenuItem menuitem) {
        this.name = menuitem.getName();
        this.price = menuitem.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
