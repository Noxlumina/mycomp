package fr.kira.formation.spring.competences.mycomp.persons;

import fr.kira.formation.spring.competences.mycomp.skills.Competence;
import fr.kira.formation.spring.competences.mycomp.skills.CompetenceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


public class PersonneServiceImpl implements PersonneService {

    public PersonneServiceImpl(PersonneRepository personneRepository,CompetenceService competenceService) {
        this.personneRepository = personneRepository;
        this.competenceService = competenceService;
    }

    @Override
    public List<Personne> findAll() {
        return personneRepository.findAll();
    }

    @Override
    public Personne save(Personne entity) {
        return personneRepository.save(entity);
    }

    @Override
    public Personne findById(String id) {
        return personneRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
    }

    @Override
    public void deleteById(String id) {
        personneRepository.deleteById(id);
    }

    @Override
    public Personne ajoutNiveauCompetence(String idPersonne, String idCompetence, Integer niveau) {
        Personne personne = personneRepository.findById(idPersonne).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        Competence competence = competenceService.findById(idCompetence);

        if (personne.getCompetences().stream().anyMatch(comp -> comp.getCompetence().getId().equals(idCompetence))) {
        personne.getCompetences().forEach(niveauCompetence->{
            if (niveauCompetence.getCompetence().getId().equals(idCompetence)){
                niveauCompetence.setNiveau(niveau);
            }
        });
        } else {
            personne.getCompetences().add(new NiveauCompetence(competence,niveau));
        }
        return save(personne);
    }

    private final PersonneRepository personneRepository;

    private final CompetenceService competenceService;


}
