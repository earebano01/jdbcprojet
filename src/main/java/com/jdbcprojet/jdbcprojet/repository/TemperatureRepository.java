package com.jdbcprojet.jdbcprojet.repository;

import com.jdbcprojet.jdbcprojet.model.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureRepository extends JpaRepository<Temperature, Long>{
    
}
