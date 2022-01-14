package ex11;

class 강아지 {
    void sound() {
        System.out.println("멍멍");
    }
}

class 고양이 {
    void sound() {
        System.out.println("야옹");
    }
}

public class ExtendsEx03 {
    static void start(강아지 u1) {
        u1.sound();
    }

    static void start(고양이 u1) {
        u1.sound();
    }

    public static void main(String[] args) {

        강아지 u1 = new 강아지();
        start(u1);

        고양이 u2 = new 고양이();
        start(u2);
    }
}
