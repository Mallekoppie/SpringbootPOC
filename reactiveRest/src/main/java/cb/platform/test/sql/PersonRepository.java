package cb.platform.test.sql;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	Person findByName(String name);
	Optional<Person> findById(Integer id);
}
