package com.Dimsoft.GestionEtudiantMatiere.services;

import java.util.List;

// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Dimsoft.GestionEtudiantMatiere.modeles.User;
import com.Dimsoft.GestionEtudiantMatiere.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Service
// @NoArgsConstructor
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createUser'");
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long idUser, User user) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
        return userRepository.findById(idUser)
        .map(u -> {
            u.setUsername(user.getUsername());
            u.setEmail(user.getEmail());
            u.setPassword(user.getPassword());
            u.setUsername(user.getUsername());
            return userRepository.save(u);
        }).orElseThrow(() -> new RuntimeException("l'utilisateur n'existe pas en base de donnees"));
    }

    @Override
    public String deleteUser(Long idUser) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
        userRepository.deleteById(idUser);
        return "l'utilisateur a ete supprimer avec succcess";
    }

    // @Override
    // public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    // }
    
}
