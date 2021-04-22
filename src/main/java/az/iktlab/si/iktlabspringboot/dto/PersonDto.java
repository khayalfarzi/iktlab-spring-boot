package az.iktlab.si.iktlabspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {

    private Long id;

    private String name;

    private String surname;

    private int age;

    private Address address;

    public class Address {
        private String name;
    }
}
