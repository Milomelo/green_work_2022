package ex00;

class Calculator {
    // add뒤에 ()는 입구.
    // void는 출구가 없다.
    void add(int n1, int n2) {
        System.out.println("더하기 메서드입니다.");
        System.out.println(n1 + n2);
    }

    void minus(int n1, int n2) {
        System.out.println("빼기 메서드 입니다.");
        System.out.println(n1 - n2);
    }

    // multi (곱하기)
    void multi(int t1, int t2) {
        System.out.println("곱하기 입니다");
        System.out.println(t1 * t2);
    }

    // devide(나누기)
    void devide(int t1, int t2) {
        System.out.println("나누기 입니다");
        System.out.println(t1 / t2);
    }
}

public class MethEx01 {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(10, 5);

        Calculator c2 = new Calculator();
        c2.minus(10, 5);

        Calculator c3 = new Calculator();
        c3.devide(10, 5);

        Calculator c4 = new Calculator();
        c4.multi(10, 5);
    }
}
