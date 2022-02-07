package Covid;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
            private int resultCode;
            private String resultMsg;

        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {

                    private String accExamCnt;
                    private String createDt;
                    private String deathCnt;
                    private String decideCnt;
                    private String seq;
                    private String stateDt;
                    private String stateTime;
                    private String updateDt;

                }
            }

        }

    }

}
