package post;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Datum {

    private Integer id;
    private String title;
    private String content;
    private User user;
    private String created;
    private String updated;

}