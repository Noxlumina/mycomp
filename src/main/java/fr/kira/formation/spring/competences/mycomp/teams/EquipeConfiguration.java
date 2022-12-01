package fr.kira.formation.spring.competences.mycomp.teams;

import fr.kira.formation.spring.competences.mycomp.persons.PersonneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EquipeConfiguration {

    @Bean
    public EquipeService equipeService(EquipeRepository equipeRepository, PersonneService personneService){
        return new EquipeServiceImpl(equipeRepository,personneService);
    }
}
