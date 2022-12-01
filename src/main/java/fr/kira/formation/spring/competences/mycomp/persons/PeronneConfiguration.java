package fr.kira.formation.spring.competences.mycomp.persons;

import fr.kira.formation.spring.competences.mycomp.skills.CompetenceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeronneConfiguration {

    @Bean
    public PersonneService personneService(PersonneRepository personneRepository, CompetenceService competenceService){
        return new PersonneServiceImpl(personneRepository,competenceService);
    }
}
