// Cette classe définit le modèle de données pour les températures, marquée comme une entité JPA.
package com.jdbcprojet.jdbcprojet.model;

import java.sql.Time;
import java.util.Date;
import java.text.SimpleDateFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "esptmp36")
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Float temperature;
    private Date date;
    private Time time;

    // Constructeur pour initialiser toutes les propriétés de l'objet Temperature.
    public Temperature(Long id, Float temperature, Date date, Time time) {
        this.id = id;
        this.temperature = temperature;
        this.date = date;
        this.time = time;
    }

    // Constructeur par défaut, nécessaire pour JPA.
    public Temperature() {
    }

    // Getters et setters pour accéder et modifier les propriétés de l'objet Temperature.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    // Cette méthode retourne la date formatée au format "yyyy-MM-dd".
    public String getFormattedDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
}
