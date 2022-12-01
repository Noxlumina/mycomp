package fr.kira.formation.spring.competences.mycomp.skills;

import fr.kira.formation.spring.competences.mycomp.persons.PersonneRepository;
import fr.kira.formation.spring.competences.mycomp.teams.Equipe;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class CompetenceServiceImpl implements CompetenceService {

    public CompetenceServiceImpl(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    private final CompetenceRepository competenceRepository;

    @Override
    public List<Competence> findAll() {
        return competenceRepository.findAll();
    }

    @Override
    public Competence save(Competence entity) {
        return competenceRepository.save(entity);
    }

    @Override
    public Competence findById(String id) {
        return competenceRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
    }

    @Override
    public void deleteById(String id) {
        competenceRepository.deleteById(id);
    }

}
