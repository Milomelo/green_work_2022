package covidProject;

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
        public class Header {
            private int resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        public class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @AllArgsConstructor
            @Data
            public class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                public class Item {
                    private String addr;
                    private String mgtStaDd;
                    private String pcrPsblYn;
                    private String ratPsblYn;
                    private String recuClCd;
                    private String sgguCdNm;
                    private String sidoCdNml;
                    private String XPosWgs84;
                    private String YPosWgs84;
                    private String yadmNm;
                    private String ykihoEnc;
                }

            }

        }

    }

}
