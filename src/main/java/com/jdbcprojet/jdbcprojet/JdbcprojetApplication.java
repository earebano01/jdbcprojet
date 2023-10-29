/**
* <h1>Projet 1</h1>
* Pour ce projet, notre objectif était de trouver une bibliothèque JAR appropriée 
* pour un projet Java lié à l'Internet des objets (IdO). J'ai choisi de développer 
* un système qui intégrerait mon ESP32, mon TMP36, mon Raspberry Pi 4B et PostgreSQL. 
* Cette application web basée sur Java collecte des données en utilisant un capteur 
* TMP36 connecté à un périphérique ESP32, qui stocke les données collectées dans une 
* base de données PostgreSQL sur mon Raspberry Pi 4B en utilisant un script Python que 
* j'ai développé le semestre dernier pour notre matière DATA1058. Ensuite, le système 
* affiche graphiquement les données de température à l'aide de Chart.js sur une page 
* web créée avec le framework Spring Boot, Thymeleaf et JDBC. Cette solution complète 
* est conçue pour surveiller et visualiser les relevés de température au fil du temps.
*
* Le système stocke les données de température dans une base de données PostgreSQL, les 
* présentant sous forme de tableau et fournissant un graphique interactif en série 
* temporelle pour la visualisation des données.
*
* @author   Adonis Rebano
* @version  1.2
* @since    26/10/2023
* @source   https://caslav-nedeljkovic.medium.com/creating-first-spring-boot-restful-api-with-postgresql-29cf14d48a4e
*/


// Cette ligne importe les classes nécessaires pour l'application Spring Boot.
package com.jdbcprojet.jdbcprojet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// L'annotation ci-dessous marque cette classe comme le point d'entrée de l'application Spring Boot.
@SpringBootApplication
public class JdbcprojetApplication {
    public static void main(String[] args) {
        // Cette ligne démarre l'application Spring Boot et l'exécute.
        SpringApplication.run(JdbcprojetApplication.class, args);
    }
}