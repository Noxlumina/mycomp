package fr.kira.formation.spring.competences.mycomp.teams;

import fr.kira.formation.spring.competences.mycomp.persons.Personne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Equipe {
    private String id;
    private String nom;
    @DBRef
    private List<Personne> membres = new ArrayList<Personne>();
}
