package ex06;

public class ConEx05 {
    public static void main(String[] args) {
        int point = 51;

        if (point >= 90) {
            System.out.println("a학점");
        } else {
            if (point >= 80) {
                System.out.println("b학점");
            } else {
                if (point >= 70) {
                    System.out.println("c학점");
                } else {
                    if (point >= 60) {
                        System.out.println("d학점");
                    } else {
                        System.out.println("f학점");

                    }
                }
            }
        }
    }
}
