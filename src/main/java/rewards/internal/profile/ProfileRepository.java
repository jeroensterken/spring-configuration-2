package rewards.internal.profile;

import rewards.internal.person.Person;

public interface ProfileRepository {

    public Profile findByPerson(Long personId);

    public void updatePerson(Profile account);
}
