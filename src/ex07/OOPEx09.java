package ex07;

class Person4 {
    String name;
    int height;
    int weight;

    Person4(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;

    }
}

public class OOPEx09 {

    public static void main(String[] args) {
        Person4 sK1 = new Person4("홍길동", 170, 70);
        Person4 sK2 = new Person4("임꺽정", 150, 100);
        System.out.println(sK1.name);
        System.out.println(sK2.name);

    }
}