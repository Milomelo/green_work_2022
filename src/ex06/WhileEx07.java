package ex06;

public class WhileEx07 {
    public static void main(String[] args) {
        long result = 1;
        for (int i = 1; i < 32; i = i + 1) {
            result = result * 2;
            System.out.println(result);

        }
    }
}
