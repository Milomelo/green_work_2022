package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import data00.AirportDto1.Response.Body.Items.Item;

public class Test03 {

    public static void main(String[] args) {

        URL url;
        try {
            url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");
            HttpURLConnection conect = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conect.getInputStream(), "utf-8"));
            String resopnseJson = br.readLine();
            Gson gson = new Gson();
            AirportDto1 dto = gson.fromJson(resopnseJson, AirportDto1.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            // 최종적으로 할 것
            Map<String, String> airportMap = new HashMap<>();
            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportId(), result.get(i).getAirportId());
            }
            System.out.println(airportMap.get("제주"));

            // System.out.println(result);
        } catch (Exception e) {
            System.out.println("앗 실수..");

        }
    }
}
