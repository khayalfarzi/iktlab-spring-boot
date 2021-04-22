package az.iktlab.si.iktlabspringboot.controller;

import az.iktlab.si.iktlabspringboot.dto.PersonDto;
import az.iktlab.si.iktlabspringboot.entity.PersonEntity;
import az.iktlab.si.iktlabspringboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/v1")
    public void save() {
        service.save();
    }

    public void insert(@RequestBody PersonDto person) {
        service.insert(person);
    }
}
