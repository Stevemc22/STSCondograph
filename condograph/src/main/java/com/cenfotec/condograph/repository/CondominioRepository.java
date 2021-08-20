package com.cenfotec.condograph.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cenfotec.condograph.entities.Condominio;

@Repository
public interface CondominioRepository extends JpaRepository<Condominio, Integer> {
}
