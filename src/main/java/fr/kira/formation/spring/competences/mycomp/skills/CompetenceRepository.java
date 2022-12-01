package fr.kira.formation.spring.competences.mycomp.skills;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompetenceRepository extends MongoRepository<Competence,String> {


}
