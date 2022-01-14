package ex06;

public class WhilePrat02 {
    public static void main(String[] args) {
        int n = 2;
        while (true) {
            if (n > 10) {
                break;
            }
            if (n % 2 == 0) {
                System.out.println(n);

            }

            n = n + 1;

        } // while 문 끝

        for (int x = 1; x < 12; x = x + 1) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }

    }
}
