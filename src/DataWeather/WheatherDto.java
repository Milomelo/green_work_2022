package DataWeather;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WheatherDto {
    private Response response;

    @Data
    @AllArgsConstructor
    class Response {
        private Header header;
        private Body body;

        @Data
        @AllArgsConstructor
        class Header {
            private int resultCode;
            private String resulMsg;

        }

        @Data
        @AllArgsConstructor
        class Body {
            private String dataType;

            private Items items;

            private int pageNo;
            private int numOfRows;
            private int totalCount;

            @Data
            @AllArgsConstructor
            class Items {
                private List<Item> item;

                @Data
                @AllArgsConstructor

                class Item {
                    private String baseDate;
                    private String baseTime;
                    private String category;
                    private String nx;
                    private String ny;
                    private String obsrValue;
                }
            }
        }
    }
}
