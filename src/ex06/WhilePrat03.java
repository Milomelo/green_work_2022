package ex06;

public class WhilePrat03 {

    public static void main(String[] args) {
        long result = 2;

        for (int i = 1; i < 32; i = i + 1) {
            System.out.println(result);
            result = result * 2;
        }
    }
}
