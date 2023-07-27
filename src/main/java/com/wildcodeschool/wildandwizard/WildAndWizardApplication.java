package com.wildcodeschool.wildandwizard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WildAndWizardApplication {

	public static void main(String[] args) {
		SpringApplication.run(WildAndWizardApplication.class, args);
	}

}


/* Attention à bien regarder toutes les classes du dépôt avant de commencer le challenge !

x Ajouter la configuration nécessaire au fonctionnement de Spring Data JPA dans application.properties du package src/main/resources
x Tester que le site fonctionne correctement
X Modifier l'entité School afin d'y ajouter le code nécessaire à son fonctionnement avec Spring Data JPA
x Modifier l'interface SchoolRepository afin d'en faire un DAO implémentant correctement JpaRepository
Modifier SchoolController afin de récupérer une instance de SchoolRepository par injection de dépendance
Ajouter les corps des méthodes du CRUD de SchoolController, afin de rendre l'administration d'une école fonctionnelle
Critères de validation
Le projet s'exécute bien sur la base de données et l'utilisateur requis.
Il est possible de créer une école.
Il est possible de modifier une école.
Il est possible d'afficher la liste de toutes les écoles.
Il est possible de supprimer une école.
La classe School contient bien tout le code nécessaire afin d'en faire une entité.
La classe SchoolRepository implémente bien JpaRepository.
La classe SchoolController récupère bien une instance de SchoolRepository par injection de dépendance.
Le code est disponible sur GitHub. */