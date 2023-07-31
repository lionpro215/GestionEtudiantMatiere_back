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
@Table(name = "PERMISSION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_permission;
    @Column(length = 50)
    private String name_permission;
    @Column(length = 200)
    private String description_permission;

    // ********** LIAISON RULEPERMISSION-PERMISSION
    @OneToMany(mappedBy = "permission_rule", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private java.util.Collection<RulePermission> permission_rules = new ArrayList<>();
}
