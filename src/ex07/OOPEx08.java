package ex07;

class Person4 {
    String name;
    int height;
    int weight;

    Person4(String d1, int d2, int d3) {
        name = d1;
        height = d2;
        weight = d3;

    }
}

public class OOPEx08 {

    public static void main(String[] args) {
        Person4 sK1 = new Person4("홍길동", 170, 70);
        Person4 sK2 = new Person4("임꺽정", 150, 100);
        System.out.println(sK1.name);
        System.out.println(sK2.name);

    }
}