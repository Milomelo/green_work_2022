package dataWeather;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import dataWeather.WheatherDto.Response.Body.Items.Item;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=====날짜를 입력하세요====");
        System.out.println("ex)20220125");
        String baseDate = sc.nextLine();

        Map<String, String> wheatherList = DownloadWheather.getWheatherList(baseDate);

        System.out.println("현재기온은" + wheatherList.get("T1H"));
        System.out.println("현재 습도는" + wheatherList.get("REH"));
    }
}
