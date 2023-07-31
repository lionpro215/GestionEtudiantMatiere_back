package com.Dimsoft.GestionEtudiantMatiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dimsoft.GestionEtudiantMatiere.modeles.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    
}
