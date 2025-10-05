Compte rendu — TP : Injection de dépendances (DAO / Métier)

Nom : Ikram Mouhsine
Université : Mundiapolis
Objectif : Comprendre et appliquer les différents types d’injection de dépendances en Java (statique, dynamique et avec Spring).

-Travail réalisé

Création de l’interface IDao avec une méthode getData().

Création de la classe DaoImpl qui implémente IDao et retourne une donnée simulée.

Création de l’interface IMetier avec une méthode calcul().

Implémentation de la classe MetierImpl, qui dépend d’un objet IDao injecté (couplage faible).

Types d’injection utilisés
 a) Instanciation statique

Les objets sont créés directement dans la classe principale Presentation.

b) Instanciation dynamique

Utilisation de la réflexion Java pour charger les classes depuis un fichier de configuration (config.txt).

Résultat obtenu

Chaque méthode d’injection fonctionne correctement :

Statique → simple mais couplage fort.

Dynamique → flexible grâce à la réflexion

Conclusion personnelle

Ce TP m’a permis de :

Comprendre la notion de couplage faible entre les classes.

Découvrir le rôle du framework Spring dans la gestion automatique des dépendances.

Apprendre à structurer un projet avec plusieurs approches d’injection.

