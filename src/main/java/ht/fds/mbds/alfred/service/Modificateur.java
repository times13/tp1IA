package ht.fds.mbds.alfred.service;

import jakarta.enterprise.context.Dependent;

import java.io.Serializable;

/**
 * Classe de service pour les modificateurs de question.
 * Un modificateur de question prend en entrée une question et retourne
 * la question modifiée.
 */
@Dependent // Portée CDI pour rendre la classe injectable par CDI dans les autres classes.
// Portée Dependent : l'instance sera supprimée quand la classe qui l'a injectée sera supprimée.
public class Modificateur implements Serializable { // Car CDI peut mettre l'instance en mémoire secondaire.
    /**
     * Modificateur de question.
     * @param question La question à modifier.
     * @param roleSysteme Le rôle système à utiliser pour la modification de la question.
     * @return La question modifiée : le rôle système en majuscule au début de la question, s'il n'est pas null,
     * suivi d'un saut de ligne,
     * puis la question en minuscule, le tout entouré de "||".
     */
           public String modifier(String question, String roleSysteme) {
            String questionEncodee = question
                    .replace(" ", "%20")
                    .replace("?", "%3F")
                    .replace("\"", "%22")
                    .replace("'", "%27");

            return "Je ne suis pas opérationnel pour le moment.\n" +
                    "Vous avez posé la question : \"" + question + "\"\n" +
                    "Veuillez la poser à Claude AI :\n" +
                    "https://claude.ai/new?q=" + questionEncodee;
        }
    }
