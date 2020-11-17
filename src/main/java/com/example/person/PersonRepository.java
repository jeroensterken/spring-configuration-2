package com.example.person;

public interface PersonRepository {

    public Person findByLastName(String lastName);

    public void updatePerson(Person account);
}
