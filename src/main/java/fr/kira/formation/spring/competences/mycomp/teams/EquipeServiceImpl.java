package fr.kira.formation.spring.competences.mycomp.teams;

import fr.kira.formation.spring.competences.mycomp.persons.Personne;
import fr.kira.formation.spring.competences.mycomp.persons.PersonneService;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class EquipeServiceImpl implements EquipeService {

    private final EquipeRepository equipeRepository;
    private final PersonneService personneService;

    public EquipeServiceImpl(EquipeRepository equipeRepository, PersonneService personneService) {
        this.equipeRepository = equipeRepository;
        this.personneService = personneService;
    }
    @Override
    public List<Equipe> findAll() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe save(Equipe entity) {
        for (Personne membre : entity.getMembres()
        ) {
            if (membre.getId() == null) {
                this.personneService.save(membre);
            }
        }

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

    @Override
    public Equipe ajoutMembre(String idEquipe, String idMembre) {
        Equipe equipe = this.findById(idEquipe);
        Personne personne = this.personneService.findById(idMembre);
        if (equipe.getMembres().stream().noneMatch(membre -> membre.getId().equals(idMembre))) {
            equipe.getMembres().add(personne);
        }
       /* boolean isMembre = false;
        for (Personne equipeMembre: equipe.getMembres()
             ) {
            if(equipeMembre.getId().equals(idMembre)){isMembre=true;break;}
        }
        if (!isMembre) equipe.getMembres().add(personne);*/
        return this.save(equipe);
    }

    @Override
    public Equipe retirerMembre(String idEquipe, String idMembre) {
        Equipe equipe = this.findById(idEquipe);
        equipe.getMembres().removeIf(membre->membre.getId().equals(idMembre));
        return save(equipe);
    }


}
