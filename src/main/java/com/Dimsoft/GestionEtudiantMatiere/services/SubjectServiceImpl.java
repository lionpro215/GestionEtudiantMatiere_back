package com.Dimsoft.GestionEtudiantMatiere.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dimsoft.GestionEtudiantMatiere.modeles.Subject;
import com.Dimsoft.GestionEtudiantMatiere.repository.SubjectRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    // @Autowired
    //  SubjectRepository subjectRepository;
    private final SubjectRepository subjectRepository;

    @Override
    public Subject createSubject(Subject subject) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createSubject'");
        return subjectRepository.save(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllSubjects'");
        return subjectRepository.findAll();
    }

    @Override
    public Subject updateSubject(Long idSubject, Subject subject) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'updaSubject'");

        Optional<Subject> founSubject = subjectRepository.findById(idSubject);

        if (!founSubject.isPresent()) {
            throw new RuntimeException("L'etudiant n'existe pas");
        }else{
            return subjectRepository.save(subject);
        }

        // return subjectRepository.findById(idSubject)
        //     .map(s -> {
        //         s.setSubjectName(subject.getSubjectName());
        //         s.setCoef(subject.getCoef());
        //         return subjectRepository.save(s);
        //     }).orElseThrow(() -> new RuntimeException("la matiere n'existe pas"));
    }

    @Override
    public String deleteSubject(Long idSubject) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deleteSubject'");
        subjectRepository.deleteById(idSubject);

        return "la matiere ayant pour id "+idSubject+" viens d'etre supprimer.";
    }
    
}
