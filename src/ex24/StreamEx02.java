package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class StreamEx02 {

    public static void main(String[] args) {
        // 한자리의 숫자를 받을 수 있다.
        InputStream in = System.in;
        // 고정된 길이의 문자를 받을 수 있다
        InputStreamReader ir = new InputStreamReader(in);

        // 단점: 고정된 길이만큼 사용하여 남거나 데이터 유실이 발생

        char[] data = new char[3]; // 절대 안씀..
        try {
            ir.read(data);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
