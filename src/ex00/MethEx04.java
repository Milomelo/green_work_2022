package ex00;

//오버로딩 = over- loading = 과적재

class 사자 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

}

class 호랑이 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx04 {
    // 사자가 호랑이를 공격
    static void attackLionToTiger(사자 unit1, 호랑이 unit2) {
        unit2.hp = unit2.hp - unit1.attack;
        System.err.println(unit2.name + "이 공격당하고 있습니다.");
        System.out.println(unit2.name + "의 hp" + unit2.hp);
    }

    static void attackLionToBear(사자 unit1, 곰 unit2) {
        unit2.hp = unit2.hp - unit1.attack;
        System.err.println(unit2.name + "이 공격당하고 있습니다.");
        System.out.println(unit2.name + "의 hp" + unit2.hp);

    }

    static void attackTigerToLion(호랑이 unit1, 사자 unit2) {
        unit2.hp = unit2.hp - unit1.attack;
        System.err.println(unit2.name + "이 공격당하고 있습니다.");
        System.out.println(unit2.name + "의 hp" + unit2.hp);
    }

    static void attackTigerToLion(호랑이 unit1, 곰 unit2) {
        unit2.hp = unit2.hp - unit1.attack;
        System.err.println(unit2.name + "이 공격당하고 있습니다.");
        System.out.println(unit2.name + "의 hp" + unit2.hp);
    }

    static void attackBearToLion(곰 unit1, 사자 unit2) {
        unit2.hp = unit2.hp - unit1.attack;
        System.err.println(unit2.name + "이 공격당하고 있습니다.");
        System.out.println(unit2.name + "의 hp" + unit2.hp);
    }

    static void attackBearToLion(곰 unit1, 호랑이 unit2) {
        unit2.hp = unit2.hp - unit1.attack;
        System.err.println(unit2.name + "이 공격당하고 있습니다.");
        System.out.println(unit2.name + "의 hp" + unit2.hp);
    }

    public static void main(String[] args) {
        사자 Lion = new 사자();
        호랑이 Tiger = new 호랑이();
        곰 Bear = new 곰();

        attackLionToTiger(Lion, Tiger);
        attackLionToBear(Lion, Bear);
        attackTigerToLion(Tiger, Lion);

    }

}
