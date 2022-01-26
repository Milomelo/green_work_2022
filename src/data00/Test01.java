package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import java.nio.charset.MalformedInputException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import data00.ResponseDto.Response.Body.Items.Item;

public class Test01 {

    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId=NAARKPK&arrAirportId=NAARKPC&depPlandTime=20220125&airlineId=ABL&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // con -> Byte Stram 선!!

            // 원래는 defualt 1Byte 한글을 읽어기 때문에 한글이
            // utf-8 한글을 3Byte르 끊어 읽겠다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            Map<String, String> airportMap = new HashMap<>();

            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getArrAirportNm(), result.get(i).getArrAirportNm());
            }
            System.out.println(airportMap.get("제주"));

        } catch (Exception e) {
            System.out.println("주소입력이 잘못되었습니다");
        }
    }
}