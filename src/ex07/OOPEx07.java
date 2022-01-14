package ex07;

class AVFSDZ {
    String name;
    int height;
    int weight;

    // 클래스 설계도에 생성자를 내가 직접 만들지 않으면 디폴트 생성자가 만들어진다.
    // 클래스명(){}
    // 디폴트 생성자 = 객체의 초기화를 위해 필요!!
    // 생성자
    AVFSDZ() {
        System.out.println("person 이생성되었습니다.");
        name = "홍길동";
        height = 170;
        weight = 70;
    }
}

public class OOPEx07 {

    public static void main(String[] args) {
        AVFSDZ sd1 = new AVFSDZ();
        System.out.println(sd1.name);
    }

}
