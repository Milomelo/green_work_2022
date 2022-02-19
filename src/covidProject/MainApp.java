package covidProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import covidProject.Hospital;
import java.sql.PreparedStatement;

public class MainApp {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT",
                    "TIGER");
            System.out.println("DB연결완료");
            String sql = "INSERT INTO)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("성공");

            } else {
                System.err.println("실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
