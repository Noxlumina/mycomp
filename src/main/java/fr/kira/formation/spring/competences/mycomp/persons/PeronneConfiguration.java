package fr.kira.formation.spring.competences.mycomp.persons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeronneConfiguration {

    @Bean
    public PersonneService personneService(PersonneRepository personneRepository){
        return new PersonneServiceImpl(personneRepository);
    }
}
