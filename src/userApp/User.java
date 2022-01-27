package userApp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // getter.stter.toString 자동생성
@AllArgsConstructor // user(int id, String username, ...)
public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;

}
