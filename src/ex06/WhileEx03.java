package ex06;

public class WhileEx03 {
    public static void main(String[] args) {
        // 남은 동전 구하기 게임
        int money = 2680; // 500*5 100*1 50*1 10*3 개로 만드시오

        int restMoney = money;

        int coin = 500;

        // 1. 500원 동전 구하기
        System.out.println(coin + "원=============");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin; // 180원

        // 2, 100원 동전 구하기
        coin = 100;
        System.out.println(coin + "원=============");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin; // 80원

        // 3. 50원 동전 구하기
        coin = 50;
        System.out.println(coin + "원=============");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin;

        // 4, 10원 동전 구하기
        coin = 10;
        System.out.println(coin + "원=============");
        System.out.println(restMoney / coin + "개"); // 30
    }
}
