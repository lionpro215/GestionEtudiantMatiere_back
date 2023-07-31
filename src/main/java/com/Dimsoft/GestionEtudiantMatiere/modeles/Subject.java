package com.Dimsoft.GestionEtudiantMatiere.modeles;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SUBJECT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_subject;
    @Column(length = 50)
    private String subjectName;
    private Integer coef;

    // ********** LIAISON SUBJECT-USERSUBJECT
    @OneToMany(mappedBy = "subject_user", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private java.util.Collection<UserSubject> subject_users = new ArrayList<>();
}
