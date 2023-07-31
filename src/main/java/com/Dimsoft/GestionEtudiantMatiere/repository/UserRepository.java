package com.Dimsoft.GestionEtudiantMatiere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dimsoft.GestionEtudiantMatiere.modeles.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    // User createUser(User user);

    // List<User> getAllUsers();

    // User updateUser(Long idUser, User user);

    // String deleteUser(Long idUser);

}
