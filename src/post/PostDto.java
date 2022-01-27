package post;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class PostDto {

    private Integer code;
    private String msg;
    private List<Datum> data = null;
}