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
@Table(name = "RULE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
public class Rule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_rule;
    @Column(length = 50)
    private String name_rule;
    @Column(length = 200)
    private String description_rule;
    
    // ********** LIAISON RULE-USERRULE
    @OneToMany(mappedBy = "rule_user", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private java.util.Collection<UserRule> rule_users = new ArrayList<>();

    // ********** LIAISON RULEPERMISSION-RULE
    @OneToMany(mappedBy = "rule_permission", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private java.util.Collection<RulePermission> rule_permissions = new ArrayList<>();
}
