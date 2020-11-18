package com.example.config;

import com.example.BankService;
import com.example.BankServiceImpl;
import com.example.account.AccountRepository;
import com.example.account.StubAccountRepository;
import com.example.person.PersonRepository;
import com.example.person.StubPersonRepository;
import com.example.profile.ProfileRepository;
import com.example.profile.StubProfileRepository;
import org.springframework.context.annotation.Bean;

public class ApplicationConfig {

    @Bean
    public BankService rewardNetwork(AccountRepository accRepo, PersonRepository personRepo, ProfileRepository profileRepo){
        return new BankServiceImpl(
                accRepo,
                personRepo,
                profileRepo);
    }

    @Bean
    public ProfileRepository profileRepository() {
        StubProfileRepository repository = new StubProfileRepository();
        return repository;
    }

    @Bean
    public PersonRepository personRepository() {
        StubPersonRepository repository = new StubPersonRepository();
        return repository;
    }

    @Bean
    public AccountRepository accountRepository(){
        StubAccountRepository repository = new StubAccountRepository();
        return repository;
    }

}
