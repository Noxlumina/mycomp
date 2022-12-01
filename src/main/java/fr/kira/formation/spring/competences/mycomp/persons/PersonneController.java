package fr.kira.formation.spring.competences.mycomp.persons;

import fr.kira.formation.spring.competences.mycomp.skills.Competence;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/personnes")
public class PersonneController {

    private PersonneService personneService;
    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }


    @GetMapping
    public List<Personne> findAll() {
        return personneService.findAll();
    }

    @PostMapping
    public Personne save(@RequestBody Personne entity) {
        return personneService.save(entity);
    }

    @GetMapping("{id}")
    public Personne findById(@PathVariable String id) {
        return personneService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        personneService.deleteById(id);
    }

    @PutMapping("{idPersonne}/competence/{idCompetence}")
    public Personne ajoutCompetence(@RequestBody Personne personne) {
        return personneService.save(personne);
    }

}
