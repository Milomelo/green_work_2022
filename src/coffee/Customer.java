package coffee;

class Cus {
    String customerName() {
        return "";
    }
}

class 홍길동 extends Cus {
    String name = "홍길동";

    String customerName() {
        return name;
    }

}

public class Customer {

    public void order(String menuName, Menu menu, Barista barista) {
        Cus hong = new 홍길동();
        Baristaa gong = new 공유();
        // 2. 메뉴항목을 찾아라!!
        MenuItem menuItem = menu.choose(menuName);
        if (menuItem == null) {
            System.out.println("찾은 메뉴가 없습니다.");
        }
        // 3. 커피를 만들어라!!
        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println(hong.customerName() + "이 " + gong.baristaaName() + "에게 커피를 받았습니다.");
        System.out.println("커피이름 : " + coffee.getName());
        System.out.println("커피가격 : " + coffee.getPrice());
    }
}