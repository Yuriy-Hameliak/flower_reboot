package ua.ucu.edu.apps.flower_contnue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.ucu.edu.apps.flower_contnue.model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer>{

    
}
