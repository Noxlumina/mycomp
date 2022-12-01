package fr.kira.formation.spring.competences.mycomp.skills;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Competence {
    private String id;
    private String nom;
    private String description;
}
