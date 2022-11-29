package Module2.Lesson18.Example4Lombok;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@EqualsAndHashCode(exclude = "name")
public class Human {

    String name;
    int age;



}
