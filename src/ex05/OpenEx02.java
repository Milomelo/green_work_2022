package ex05;

public class OpenEx02 {
    public static void main(String[] args) {
        System.out.println(!(1 == 2)); // 괄호는 우선순위를 지정할 수 있다.
        System.out.println(!true);
        System.out.println(1 != 3); // 같지 않나요
        System.out.println(1 < 2);
        System.out.println(1 > 2);
        int x = 3;
        int y = 4;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x <= y);

        int z = 3;
        int a = 4;
        System.out.println((z == 3) && (a == 7));
        System.out.println((z == 3) || (a == 4));
    }
}
