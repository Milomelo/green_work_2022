package post;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {

    public static void main(String[] args) {

        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String jsonResponse = br.readLine();

            Gson gson = new Gson();

            PostDto dto = gson.fromJson(jsonResponse, PostDto.class);

            if (dto.getCode() != 1) {
                System.out.println("통신 실패 : " + dto.getMsg());
                return; // 스택 종료
            }

            dto.getData().get(1).setId(5000);

            System.out.println(dto.getData().get(1).getId());
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("===============");
                System.out.println("게시글 제목: " + dto.getData().get(i).getTitle());
                System.out.println("게시글 내용: " + dto.getData().get(i).getContent());
                System.out.println("===============");
                System.out.println("게시글 아이디: " + dto.getData().get(i).getUser().getId());
                System.out.println("게시글 메일: " + dto.getData().get(i).getUser().getEmail());
            }

        } catch (Exception e) {

        }
    }
}
