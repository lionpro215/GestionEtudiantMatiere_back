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
@Table(name = "RULEPERMISSION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RulePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_rule_permission;

    // ********** LIAISON RULEPERMISSION-RULE
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_rule", nullable = false)
    private Rule rule_permission;
    
    // ********** LIAISON RULEPERMISSION-PERMISSION
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_permission", nullable = false)
    private Permission permission_rule;
}
