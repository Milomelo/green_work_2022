package ex06;

public class GugudanEx03 {

    public static void main(String[] args) {

        for (int step = 2; step <= 9; step++) {

            for (int n = 1; n < 10; n = n + 1) {
                System.out.println(step + "*" + n + "= " + (step * n));
            }
        }
    }
}
