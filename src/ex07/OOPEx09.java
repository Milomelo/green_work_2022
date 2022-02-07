package ex07;

class fewf {
    String name;
    int height;
    int weight;

    fewf(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;

    }
}

public class OOPEx09 {

    public static void main(String[] args) {
        fewf sK1 = new fewf("홍길동", 170, 70);
        fewf sK2 = new fewf("임꺽정", 150, 100);
        System.out.println(sK1.name);
        System.out.println(sK2.name);

    }
}