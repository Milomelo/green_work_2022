package ex06;

import java.util.Scanner;

public class WhileEx04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int money = 2680;

            while (true) {
                int coin = sc.nextInt();
                int restMoeny = money;

                System.out.println(coin + "원=============");
                System.out.println(restMoeny / coin + "개");
                int restMoney = restMoeny % coin;

                if (restMoney == 0) {
                    break;
                }

                // 남은 동전 출력하는 로직

                // if 문 break;

            }
        }

    }
}
