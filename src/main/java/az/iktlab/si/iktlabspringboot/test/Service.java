package az.iktlab.si.iktlabspringboot.test;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Service {

    public static List<Person> getByAge() {
        System.out.println("get by age method started");
        return DB.PEOPLE
                .stream()
                .filter(person -> person.getAge() > 50)
                .collect(Collectors.toList());
    }
}
