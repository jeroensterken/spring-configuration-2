package com.example.profile;

public class Profile {

    private Long id;
    private Long personId;
    private String name;

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }

    public Profile(Long id, Long personId, String name) {
        this.id = id;
        this.personId = personId;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
