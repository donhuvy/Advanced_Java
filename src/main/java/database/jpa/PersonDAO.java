package database.jpa;

import java.util.List;

/**
 * Person Data access object.
 */
public interface PersonDAO {

    List<Person> findAll();

    Person findById(Integer id);

    Integer save(Person p);

    void delete(Person p);

    List<Integer> getIds();

}
