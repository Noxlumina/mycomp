package fr.kira.formation.spring.competences.mycomp.persons;

import fr.kira.formation.spring.competences.mycomp.skills.Competence;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data@AllArgsConstructor
@NoArgsConstructor
public class NiveauCompetence {
    @DBRef
    private Competence competence;
    private Integer niveau;
}
