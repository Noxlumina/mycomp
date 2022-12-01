package fr.kira.formation.spring.competences.mycomp.teams;

import fr.kira.formation.spring.competences.mycomp.persons.Personne;
import fr.kira.formation.spring.competences.mycomp.skills.CompetenceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class EquipeServiceImpl implements EquipeService {
    @Override
    public List<Equipe> findAll() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe save(Equipe entity) {
        return equipeRepository.save(entity);
    }

    @Override
    public Equipe findById(String id) {
        return equipeRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
    }

    @Override
    public void deleteById(String id) {
        equipeRepository.deleteById(id);
    }

    public EquipeServiceImpl(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    private final EquipeRepository equipeRepository;
}
