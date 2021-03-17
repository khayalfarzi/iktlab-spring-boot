package az.iktlab.si.iktlabspringboot.test;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    private String name;
    private String sname;
    private int age;
}