package ex06;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {

        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int i;

        for (n2 = 0; n1 <= n2; n1 = n1 + 1) {
            for (i = 1; i < 10; i = 1 + i) {
                System.out.println(n1 + "*" + i + "=" + n1 * i);
            }
            System.out.println(n1 + "단 끝");
        }
    }
}

/**
 * n1=5 (6) n2=7
 * n1이 n2가 될때까지 실행하세요
 * 
 */
