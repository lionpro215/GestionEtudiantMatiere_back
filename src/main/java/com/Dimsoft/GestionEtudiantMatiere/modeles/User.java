package com.Dimsoft.GestionEtudiantMatiere.modeles;

import java.util.ArrayList;

// import org.hibernate.mapping.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
// import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// import java.util.Collection;

@Entity
@Table(name = "USER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_user;
    @Column(length = 30)
    private String name;
    // @Email
    private String email;
    private String password;
    private String username;

    // ********** LIAISON USER-USERSUBJECT
    @OneToMany(mappedBy = "user_subject", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private java.util.Collection<UserSubject> user_subjects = new ArrayList<>();

    // ********** LIAISON USER-USERRULE
    @OneToMany(mappedBy = "user_rule", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private java.util.Collection<UserRule> user_rules = new ArrayList<>();


}