package fr.kira.formation.spring.competences.mycomp.persons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Personne {
    private String id;
    private String nom;
    private String prenom;
}
