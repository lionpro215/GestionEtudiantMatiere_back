package com.Dimsoft.GestionEtudiantMatiere.modeles;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USERSUBJECT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_user_subject;

    // ********** LIAISON USERSUBJECT-USER
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_subject", nullable = false)  
    private Subject subject_user;

    // ********** LIAISON USERSUBJECT-SUBJECT
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", nullable = false)
    private User user_subject;
}
