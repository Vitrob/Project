package special;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Flower {

    private String color;
    private String type;

    @JsonSerialize(using = Seralizer.class)
    @JsonDeserialize(using = Deserializer.class)
    private LocalDateTime harvestDate;

  //  public String getColorType() {
  //      return color + " " + type;
  //  }

}
