package fr.kira.formation.spring.competences.mycomp.skills;

import fr.kira.formation.spring.competences.mycomp.persons.Personne;
import fr.kira.formation.spring.competences.mycomp.persons.PersonneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/competences")
public class CompetenceController {

    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }

    private CompetenceService competenceService;


    @GetMapping
    public List<Competence> findAll() {
        return competenceService.findAll();
    }

    @PostMapping
    public Competence save(@RequestBody Competence entity) {
        return competenceService.save(entity);
    }

    @GetMapping("{id}")
    public Competence findById(@PathVariable String id) {
        return competenceService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        competenceService.deleteById(id);
    }


}
