package az.iktlab.si.iktlabspringboot.service;

import az.iktlab.si.iktlabspringboot.dto.PersonDto;
import az.iktlab.si.iktlabspringboot.entity.PersonEntity;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    void save();

    void insert(PersonDto person);
}