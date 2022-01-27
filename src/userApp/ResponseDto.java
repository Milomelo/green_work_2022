package userApp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto {
    private int code;// 1.성공/ -1 실패 / 0은 데이터 없음. ㅇ ㅡ ㅇ
    private String msg; // 실패의 원인
    private List<User> data; // 같은 패키지에 있으면 import 할 필요가 없음. import는 같은 패키지에 있도록 만드는 것

}
