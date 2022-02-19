package covidProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import covidProject.ResponseDto.Response.Body.Items.Item;

public class DownloadCovid {

    public static List<Hospital> getCovidList() {

        List<Hospital> hospitalList;

        try {
            URL url = new URL(
                    "http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService?serviceKey=f%2BafZVkcjTIbiKy2FpST1dZWhtMXocgF70j2NsCMFqx04qe0U2MNwjS0BGqgqzZHttuGKxxK4Jh60Uj2PyMSkw%3D%3D&pageNo=1&numOfRows=5190&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            hospitalList = new ArrayList<>(); // 동기화가 처리된 ArrayList

            int totalCount = dto.getResponse().getBody().getTotalCount();

            url = new URL(
                    "http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService?serviceKey=f%2BafZVkcjTIbiKy2FpST1dZWhtMXocgF70j2NsCMFqx04qe0U2MNwjS0BGqgqzZHttuGKxxK4Jh60Uj2PyMSkw%3D%3D&pageNo=1&numOfRows=totalCount&_type=json");
            conn = (HttpURLConnection) url.openConnection();
            br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            responseJson = br.readLine();
            gson = new Gson();
            dto = gson.fromJson(responseJson, ResponseDto.class);
            result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                Hospital h = new Hospital(
                        result.get(i).getAddr(),
                        result.get(i).getMgtStaDd(),
                        result.get(i).getPcrPsblYn(),
                        result.get(i).getRatPsblYn(),
                        result.get(i).getRecuClCd(),
                        result.get(i).getSgguCdNm(),
                        result.get(i).getSidoCdNml(),
                        result.get(i).getXPosWgs84(),
                        result.get(i).getYPosWgs84(),
                        result.get(i).getYadmNm(),
                        result.get(i).getYkihoEnc());
                hospitalList.add(h);
            }
            return hospitalList;
        } catch (Exception e) {
            System.out.println("에러발생");
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getCovidList().size());
        // try {
        // Connection conn =
        // DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT",
        // "TIGER");
        // System.out.println("DB연결완료");
        // String sql = "INSERT INTO
        // 코로나(addr,mgtStaDd,pcrPsblYn,ratPsblYn,recuClCd,sgguCdNm,sidoCdNm,XPosWgs84,YPosWgs84,yadmNm,ykihoEnc)
        // VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        // PreparedStatement pstmt = conn.prepareStatement(sql);
        // for (int i = 0; i < getCovidList().size(); i++) {
        // pstmt.setString(1, getCovidList().get(i).getAddr());
        // pstmt.setString(2, getCovidList().get(i).getMgtStaDd());
        // pstmt.setString(3, getCovidList().get(i).getPcrPsblYn());
        // pstmt.setString(4, getCovidList().get(i).getRatPsblYn());
        // pstmt.setString(5, getCovidList().get(i).getRecuClCd());
        // pstmt.setString(6, getCovidList().get(i).getSgguCdNm());
        // pstmt.setString(7, getCovidList().get(i).getSidoCdNm());
        // pstmt.setString(8, getCovidList().get(i).getXPosWgs84());
        // pstmt.setString(9, getCovidList().get(i).getYPosWgs84());
        // pstmt.setString(10, getCovidList().get(i).getYadmNm());
        // pstmt.setString(11, getCovidList().get(i).getYkihoEnc());
        // int result = pstmt.executeUpdate();

        // if (result > 0) {
        // System.out.println("성공");

        // } else {
        // System.err.println("실패");
        // }
        // }

        // } catch (Exception e) {
        // e.printStackTrace();
        // }
    }
}
