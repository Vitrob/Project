package special;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.NonNull;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deserializer extends JsonDeserializer<LocalDateTime> {
    @Override
    public LocalDateTime deserialize(@NonNull JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {

        //works but there is a format issue
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
        return LocalDateTime.parse(jsonParser.getText(), formatter);
    }
}
