package test01;

// 1. start 메서드에서 name을 출력해보세요!!
// 2. start 메서드에서 name 값을 변경해서 출력해보세요!!
class 애완동물 {
    void sound() {
    }
}

class 고양이 extends 애완동물 {

    String name = "고양이";

    void sound() {
        System.out.println("야옹");
    }
}

public class B {

    static void start(애완동물 u1) {
        u1.sound();
    }

    public static void main(String[] args) {
        고양이 cat = new 고양이();
        start(cat);

        System.out.println(cat.name);
    }
}