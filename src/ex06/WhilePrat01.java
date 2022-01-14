package ex06;

public class WhilePrat01 {
    public static void main(String[] args) {

        int money = 2680;
        int restMoney = money;

        System.out.println("500원 개수");
        System.out.println(restMoney / 500);
        restMoney = restMoney % 500;

        System.out.println("100원 개수");
        System.out.println(restMoney / 100);
        restMoney = restMoney % 100;

        System.out.println("50원의 개수");
        System.out.println(restMoney / 50);
        restMoney = restMoney % 50;
    }
}
