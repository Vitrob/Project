import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Car {

    private Integer quantity;
    private Quality quality;
    private Double engine;
    private boolean working;
    private Color color;



}
