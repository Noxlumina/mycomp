package fr.kira.formation.spring.competences.mycomp.persons;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonneRepository extends MongoRepository <Personne,String> {

}
