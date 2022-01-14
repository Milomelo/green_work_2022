package ex07;

/**
 * 문법
 * 클래스 내부 변수는 (상태)는 선언만 한다.
 */
class 사람 {
    String name;
    int height;
    int weight;
}

public class OOPEx06 {

    public static void main(String[] args) {

        사람 s1 = new 사람();
        s1.name = "홍길동";
        s1.height = 50;
        s1.weight = 50;

        System.out.println("이름은" + s1.name + "입니다" + "키:" + s1.height + " 몸무게" + s1.weight);

        사람 s2 = new 사람();
        s2.name = "고길동";
        s2.height = 178;
        s2.weight = 50;

        System.out.println("이름은" + s2.name + "입니다" + "키:" + s2.height + " 몸무게" + s2.weight);
        사람 s3 = new 사람();
        s3.name = "김기덕";
        s3.height = 138;
        s3.weight = 20;

        System.out.println("이름은" + s3.name + "입니다" + "키:" + s3.height + " 몸무게" + s3.weight);
    }
}
