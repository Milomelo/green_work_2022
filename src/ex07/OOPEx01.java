package ex07;

class Car {
    int speed = 90; // static이 없기 때문에 메모리에 뜨지 않음
    static int n = 80;
}

public class OOPEx01 {

    public static void main(String[] args) {
        // new는 heap에 할당하라는 키워드
        // Car 클래스가 가지고 있는 static이 아닌 모든 것들이 heap에 뜬다. => staric은 이미 작동하고 있는 상태

        Car avc = new Car(); // Car sss = 주소 / car는 자료형(custome자료형)/ new Car은 그저 메모리에 뛰운 것 주소를 모름
        System.out.println(avc.speed);
    }
}
