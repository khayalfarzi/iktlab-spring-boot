package az.iktlab.si.iktlabspringboot.service;

import az.iktlab.si.iktlabspringboot.dto.PersonDto;
import az.iktlab.si.iktlabspringboot.entity.PersonEntity;
import az.iktlab.si.iktlabspringboot.repository.PersonRepo;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepo repo;

    public PersonServiceImpl(PersonRepo repo) {
        this.repo = repo;
    }

    @Override
    public void save() {
        System.out.println("save...");
    }

    public void insert(PersonDto person) {
        System.out.println("Insert method started");

        PersonEntity entity = new PersonEntity();
        entity.setAge(person.getAge());
        entity.setId(person.getId());
        entity.setName(person.getName());
        entity.setSurname(person.getSurname());

//       PersonEntity personEntity = modelMapper.map(person, PersonEntity.class);

        PersonEntity personEntity = PersonEntity.builder()
                .name(person.getName())
                .surname(person.getSurname())
                .id(person.getId())
                .age(person.getAge())
                .build();

        repo.save(entity);
        System.out.println("Insert method ended");
    }

}
