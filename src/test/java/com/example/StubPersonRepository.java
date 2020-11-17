package com.example;

import com.example.person.Person;
import com.example.person.PersonRepository;

public class StubPersonRepository implements PersonRepository {
    @Override
    public Person findByLastName(String firstName) {
        return null;
    }

    @Override
    public void updatePerson(Person account) {

    }
}
