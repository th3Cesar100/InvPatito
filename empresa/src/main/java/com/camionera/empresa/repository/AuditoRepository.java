package com.camionera.empresa.repository;


import com.camionera.empresa.entity.Audito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoRepository extends JpaRepository<Audito, Long> {
}
