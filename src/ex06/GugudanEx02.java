package ex06;

public class GugudanEx02 {
    public static void main(String[] args) {

        for (int n = 1; n < 10; n = n + 1) {

            for (int step = 6; step <= 7; step++) {
                System.out.println(step + "*" + n + "= " + (step * n));
            }
        }
    }
}
