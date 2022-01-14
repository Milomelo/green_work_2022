package ex07;

public class MethodEx01 {
    // 1. 자바는 모든 코드가 Class 내부에 있어야함
    // 2. 자바는 즉 class만 1급 (프로그래밍언어에서 가장 바깥에 쓸 수 있는 객체)
    // 3. class = 설계도
    // 4. 클래스는 상태(변수)와 행위(매서드)를 가진다.

    // 메서드
    static void add(int n1) {
        System.out.println("받은 숫자는" + n1);
    }

    public static void main(String[] args) {

        MethodEx01.add(5000); // 메서드 호출
    }
}
