import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {

        Car audio = Car.builder()
                .quantity(7)
                .quality(Quality.GOOD)
                .engine(1.6)
                .working(true)
                .color(Color.builder().name("blue").build())
                .build();


        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(audio));
        System.out.println(objectMapper.readValue(FileWithClassPath.getFilePath("honza.json"), Car.class));

    }
}
