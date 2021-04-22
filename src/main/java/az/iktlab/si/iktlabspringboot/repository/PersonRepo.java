package az.iktlab.si.iktlabspringboot.repository;

import az.iktlab.si.iktlabspringboot.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<PersonEntity, Long> {
}