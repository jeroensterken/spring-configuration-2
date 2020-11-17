package com.example.profile;

public interface ProfileRepository {

    public Profile findByPerson(Long personId);

    public void updatePerson(Profile account);
}
