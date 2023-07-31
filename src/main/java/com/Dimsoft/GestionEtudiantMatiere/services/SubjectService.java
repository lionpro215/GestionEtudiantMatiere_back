package com.Dimsoft.GestionEtudiantMatiere.services;

import java.util.List;

import com.Dimsoft.GestionEtudiantMatiere.modeles.Subject;

public interface SubjectService {
    
    Subject createSubject(Subject subject);

    List<Subject> getAllSubjects();

    Subject updateSubject(Long idSubject, Subject subject);

    String deleteSubject(Long idSubject);

}
