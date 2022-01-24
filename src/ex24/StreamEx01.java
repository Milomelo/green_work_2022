package ex24;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스) 컴퓨터(목적이)의 Stream이 연결
        // 단점
        // 한자씩 받을 수 있다. 문자로 바꿔지주 않는다

        InputStream s = System.in;
        try {
            int n = s.read();
            System.out.println(n);

        } catch (IOException e) {
            System.out.println("에러가 발생했슴다");
        }
    }
}
