package com.example;

import com.example.person.Person;
import com.example.person.PersonRepository;
import java.util.HashMap;
import java.util.Map;

public class StubPersonRepository implements PersonRepository {

    private Map<String, Person> accountsByLastName = new HashMap<String, Person>();

    public StubPersonRepository() {
        Person person = new Person(1L, "doctor", "who");
        accountsByLastName.put("who", person);
    }

    @Override
    public Person findByLastName(String lastName) {
        Person person = accountsByLastName.get(lastName);
        if (person == null) {
            throw new RuntimeException("no person has been found for lastName " + lastName);
        }

        return person;
    }

    @Override
    public void updatePerson(Person account) {

    }
}
