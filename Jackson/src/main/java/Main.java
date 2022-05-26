import com.fasterxml.jackson.databind.ObjectMapper;
import normal.Car;
import normal.Color;
import normal.Quality;
import special.Flower;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {

        System.out.println("Normal serializer - Car class");
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

        System.out.println();
        System.out.println("Special serializer - Flower class");
        Flower daisy = Flower.builder()
                .color("white")
                .type("daisy")
                .harvestDate(LocalDateTime.now())
                .build();

        System.out.println(objectMapper.writeValueAsString(daisy));
        System.out.println(objectMapper.readValue(FileWithClassPath.getFilePath("sunflower.json"), Flower.class));

    }
}
