package ex00;

class Calculator2 {

    // 투입구, 출구가 다 있는 메서드
    // 출력과 반환의 차이
    // 반환은 int (숫자) 값을 반환하는 것
    // 출력은 string("숫자")를 출력하는 것

    static int add(int a1, int a2) {
        return a1 + a2;
    }

    static int minus(int a1, int a2) {
        return a1 - a2;

    }

    static int multi(int a1, int a2) {
        return a1 * a2;
    }

    static int devide(int a1, int a2) {
        return a1 / a2;
    }

}

public class MethEx02 {

    public static void main(String[] args) {
        int r1 = Calculator2.add(10, 8);
        System.out.println("r1=" + r1);

        int r2 = Calculator2.minus(20, 3);
        System.out.println("r2=" + r2);

        int r3 = Calculator2.multi(10, 7);
        System.out.println("r3=" + r3);

        int r4 = Calculator2.devide(30, 6);
        System.out.println("r4=" + r4);

    }
}
