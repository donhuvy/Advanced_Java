package database.jdbc;

import java.util.List;

/**
 * Person Data access object interface.
 */
public interface PersonDAO {

    List<Person> findAll();

    Person findById(Integer id);

    Integer save(Person p);

    void delete(Person p);

    List<Integer> getIds();

}
