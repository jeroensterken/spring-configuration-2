package com.example.profile;

import com.example.profile.Profile;
import com.example.profile.ProfileRepository;

import java.util.HashMap;
import java.util.Map;

public class StubProfileRepository implements ProfileRepository {

    private Map<Long, Profile> profileByPersonId = new HashMap<Long, Profile>();

    public StubProfileRepository() {
        Profile profile = new Profile(1L, 1L, "special profile");
        profileByPersonId.put(1L, profile);
    }

    @Override
    public Profile findByPerson(Long personId) {
        Profile profile = profileByPersonId.get(personId);
        if (profile == null) {
            throw new RuntimeException("no profile has been found for personid " + personId);
        }

        return profile;
    }

    @Override
    public void updateProfile(Profile account) {

    }

}
