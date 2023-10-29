// Cette interface définit un référentiel (repository) JPA pour l'entité Temperature.
package com.jdbcprojet.jdbcprojet.repository;

import com.jdbcprojet.jdbcprojet.model.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;

// Cette interface étend JpaRepository, ce qui permet d'effectuer des opérations de CRUD sur l'entité Temperature.
public interface TemperatureRepository extends JpaRepository<Temperature, Long> {
    
}
