package DataWeather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import DataWeather.WheatherDto.Response.Body.Items.Item;

public class DownloadWheather {

    public static Map<String, String> getWheatherList(String baseDate) {

        Map<String, String> wheatherMap = new HashMap<>();
        try {

            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=dSHJNipMJz%2BPWTt9UN2qgExW7ql36lF%2BXp81YL%2FD42muatm7QP9jYJQSfIPMJ79C6NLitgJqd%2FGhRmY6U6YWwg%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date=20220126&base_time=0600&nx=97&ny=75");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String jsonResponse = br.readLine();
            Gson gson = new Gson();
            WheatherDto dto = gson.fromJson(jsonResponse, WheatherDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                wheatherMap.put(result.get(i).getCategory(), result.get(i).getObsrValue());
            }

        } catch (Exception e) {
            System.out.println("날씨 데이터 오류");
        }
        return wheatherMap;
    }
}
