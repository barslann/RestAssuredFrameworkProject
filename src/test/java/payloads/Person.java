package payloads;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;
    private int age;
}
