package fr.kira.formation.spring.competences.mycomp.persons;

import java.util.List;

public interface PersonneService {
    List<Personne> findAll();

    Personne save(Personne entity);

    Personne findById(String id);

    void deleteById(String id);

    Personne ajoutNiveauCompetence(String idPersonne,String idCompetence, Integer niveau);
}
