package ex00;

public class MethEx03 {

    int sum = 0;

    void start() {

        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        sum = result;

    }

    public static void main(String[] args) {

        MethEx03 m = new MethEx03();
        m.start();// 클래스명 생략 가능 (같은 클래스에 있기 때문에!!)
    }

}
