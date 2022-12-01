package fr.kira.formation.spring.competences.mycomp.skills;

import fr.kira.formation.spring.competences.mycomp.persons.PersonneRepository;
import fr.kira.formation.spring.competences.mycomp.persons.PersonneService;
import fr.kira.formation.spring.competences.mycomp.persons.PersonneServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompetenceConfiguration {

    @Bean
    public CompetenceService competenceService(CompetenceRepository competenceRepository){
        return new CompetenceServiceImpl(competenceRepository);
    }
}
