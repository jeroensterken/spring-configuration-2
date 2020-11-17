package rewards.internal.person;

public interface PersonRepository {

    public Person findByLastName(String firstName);

    public void updatePerson(Person account);
}
