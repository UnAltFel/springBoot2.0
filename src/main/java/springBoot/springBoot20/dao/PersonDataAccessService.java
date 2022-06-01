package springBoot.springBoot20.dao;

import org.springframework.stereotype.Repository;
import springBoot.springBoot20.api.PersonDao;
import springBoot.springBoot20.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("postgres")
public class PersonDataAccessService implements PersonDao {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(),"FROM POSTGRES DB"));
    }

    @Override
    public Optional<Person> selectPersonbyId(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
