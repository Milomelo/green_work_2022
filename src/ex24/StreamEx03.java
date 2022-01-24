package ex24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class StreamEx03 {

    // 블로그에 꼭 정리할것
    // 01 02 단점만 정리
    //
    public static void main(String[] args) {

        InputStream in = System.in; // 단점: 한자씩 숫자로 받는다
        InputStreamReader ir = new InputStreamReader(in); // 단점 고정된 길이를 받는다.
        BufferedReader br = new BufferedReader(ir); // 장점: 가변길이의 문자열을 받는다

        try {
            String line = br.readLine();
            System.out.println("받은문자열" + line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 참고용
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

    }
}
