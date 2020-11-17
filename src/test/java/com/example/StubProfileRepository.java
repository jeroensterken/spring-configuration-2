package com.example;

import com.example.profile.Profile;
import com.example.profile.ProfileRepository;

public class StubProfileRepository implements ProfileRepository {
    @Override
    public Profile findByPerson(Long personId) {
        return null;
    }

    @Override
    public void updatePerson(Profile account) {

    }
}
