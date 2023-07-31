package com.Dimsoft.GestionEtudiantMatiere.controleurs;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dimsoft.GestionEtudiantMatiere.modeles.Subject;
import com.Dimsoft.GestionEtudiantMatiere.services.SubjectService;

// import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/subject")
@AllArgsConstructor
@CrossOrigin("*")
public class SubjectControleur {
    
    private final SubjectService subjectService;

    @PostMapping("/createSubject")
    public Subject createSubject(@RequestBody Subject subject){
        return subjectService.createSubject(subject);
    }

    @GetMapping("/getAllSubjects")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @PutMapping("/updateSubject/{idSubject}")
    public Subject updateSubject(@PathVariable Long idSubject, @RequestBody Subject subject){
        return subjectService.updateSubject(idSubject, subject);
    }

    @DeleteMapping("/deleteSubject/{idSubject}")
    public String deleteSubject(@PathVariable Long idSubject){
        return subjectService.deleteSubject(idSubject);
    }

}
