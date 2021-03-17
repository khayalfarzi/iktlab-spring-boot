package az.iktlab.si.iktlabspringboot;

import az.iktlab.si.iktlabspringboot.test.Person;
import az.iktlab.si.iktlabspringboot.test.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class IktlabSpringBootApplication {

    public static void main(String[] args) {
        System.out.println("Hello world");
        SpringApplication.run(IktlabSpringBootApplication.class, args);
    }

    @GetMapping("/get")
    public List<Person> hello() {
        return Service.getByAge();
    }
}