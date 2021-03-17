package az.iktlab.si.iktlabspringboot.test;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DB {

    public static final List<Person> PEOPLE = new ArrayList<>();

    @PostConstruct
    public void loader() {
        System.out.println("loader method starting");
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(11).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(22).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(22).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(112).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(112).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(112).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(112).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(112).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(112).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(112).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(121).build());
        PEOPLE.add(Person.builder().name("name 1").sname("sname 1").age(121).build());

        System.out.println("loader method ended");
    }
}
