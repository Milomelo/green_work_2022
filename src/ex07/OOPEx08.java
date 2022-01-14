package ex07;

class 가가가가 {
    String name;
    int height;
    int weight;

    가가가가(String d1, int d2, int d3) {
        name = d1;
        height = d2;
        weight = d3;

    }
}

public class OOPEx08 {

    public static void main(String[] args) {
        가가가가 sK1 = new 가가가가("홍길동", 170, 70);
        가가가가 sK2 = new 가가가가("임꺽정", 150, 100);
        System.out.println(sK1.name);
        System.out.println(sK2.name);

    }
}