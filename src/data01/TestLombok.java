package data01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor // 어노테이션
@Getter
@Setter
class 사자 {
    private String name;
    private String color;

}

public class TestLombok {
    public static void main(String[] args) {
        사자 s = new 사자("사자", "노랑");
        // s.setName("사자");
        s.getName();

        System.out.println(s.getName());

    }
}
