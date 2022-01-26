package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
class AirportDto {
    private Response response;

    @Data
    @AllArgsConstructor
    class Response {

        private Header header;
        private Body body;

        @Data
        @AllArgsConstructor
        class Header {

            private String resultCode;
            private String resultMsg;

        }

        @Data
        @AllArgsConstructor
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;

            private int totalCount;

            @Data
            @AllArgsConstructor
            class Items {
                private List<Item> item;

                @Data
                @AllArgsConstructor
                class Item {
                    private String airportId;
                    private String airportNm;

                }

            }

        }

    }

}

@Data
class FlightDto {
    private Response response;

}

@Data
@AllArgsConstructor
class Response {
    private Header header;
    private Body body;

    @Data
    @AllArgsConstructor
    class Header {

        private String resultCode;
        private String resultMsg;

    }

    @Data
    @AllArgsConstructor
    class Body {
        private Items items;
        private int numOfRows;
        private int pageNo;

        private int totalCount;

        @Data
        @AllArgsConstructor
        class Items {
            private List<Item> item;

            @Data
            @AllArgsConstructor
            class Item {
                private String airlineNm;
                private String arrAirportNm;
                private String arrPlandTime;
                private String depAairportNm;
                private String depPlandTime;
                private int economyCharge;
                private int prestigeCharge;
                private String vihicleId;
            }
        }
    }
}

@Data
@AllArgsConstructor
class GenericBox<T> {

    T data;

}

public class GenericEx01 {

    public static void main(String[] args) {

        GenericBox<AirportDto> ad = new GenericBox<AirportDto>(new AirportDto());
        GenericBox<FlightDto> ad1 = new GenericBox<FlightDto>(new FlightDto());
    }
}
