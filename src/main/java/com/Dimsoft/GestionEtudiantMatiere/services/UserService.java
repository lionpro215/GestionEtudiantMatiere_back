package com.Dimsoft.GestionEtudiantMatiere.services;

import java.util.List;

import org.springframework.stereotype.Service;

// import com.Dimsoft.GestionEtudiantMatiere.modeles.Subject;
import com.Dimsoft.GestionEtudiantMatiere.modeles.User;

import lombok.AllArgsConstructor;

// @Service
// @AllArgsConstructor
public interface UserService {
    
    User createUser(User user);

    List<User> getAllUsers();

    User updateUser(Long idUser, User user);

    String deleteUser(Long idUser);

}
