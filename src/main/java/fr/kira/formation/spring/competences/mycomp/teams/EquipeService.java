package fr.kira.formation.spring.competences.mycomp.teams;

import java.util.List;

public interface EquipeService {
    List<Equipe> findAll();

    Equipe save(Equipe entity);

    Equipe findById(String id);

    void deleteById(String id);

    /**
     * ajouter un membre (idmembre) à l'équipe (idequipe)
     * @param idEquipe id de l'équipe
     * @param idMembre id de la personne qui devient membre
     * @return l'équipe avec les membres
     */
    Equipe ajoutMembre(String idEquipe,String idMembre);

    /**
     * retirer un membre (idmembre) à l'équipe (idequipe)
     * @param idEquipe id de l'équipe
     * @param idMembre id de la personne qui n'est plus dans l'équipe
     * @return l'équipe avec les membres
     */
    Equipe retirerMembre(String idEquipe,String idMembre);
}
