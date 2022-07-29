package com.rbhvac.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbhvac.demo.model.Clients;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long>{

}

