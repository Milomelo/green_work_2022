package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import data00.AirportDto.Response.Body.Items.Item;

public class DownloadAirport {

    // 공항목록을 조회하여 Map에 담아서 return하는 메서드
    public static Map<String, String> getAirportList() {

        Map<String, String> airportMap = new HashMap<>();
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");

            // conn -> byte Stream 선!!
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 원래 defualt는 1bytre로 한글을 끊어 읽어서 글이 깨졋는데
            // utf-8은 3byte로 끊어 읽겠다.
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine();
            Gson gson = new Gson();
            AirportDto dto = gson.fromJson(responseJson, AirportDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
            }

        } catch (Exception e) {

            System.out.println("에어포드 목록 조회중 오류가 발생했습니다.");
        }
        return airportMap;

    }
}
