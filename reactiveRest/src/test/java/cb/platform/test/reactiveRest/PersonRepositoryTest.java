package cb.platform.test.reactiveRest;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cb.platform.test.sql.Person;
import cb.platform.test.sql.PersonRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {

	@Autowired
	PersonRepository repository;
	
    @Before
    public void setUp() throws Exception {
        Person user1= new Person("Alice", "Brannas");
        Person user2= new Person("Bob", "Jack Daniels Honey");
        //save user, verify has ID value after save
        //assertNull(user1.getId());
        //assertNull(user2.getId());//null before save
        this.repository.save(user1);
        this.repository.save(user2);
        assertNotNull(user1.getId());
        assertNotNull(user2.getId());
    }
	
	@Test
	public void test() {
	       /*Test data retrieval*/
        Optional<Person> findById = repository.findById(1);
        Person person = findById.get();
        assertNotNull(person);
        assertEquals("Brannas", person.getSurname());
        /*Get all products, list should only have two*/
        Iterable<Person> users = repository.findAll();
        int count = 0;
        for(Person p : users){
            count++;
        }
        assertTrue(count > 0);
	}

}
