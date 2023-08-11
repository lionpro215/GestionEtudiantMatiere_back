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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Dimsoft.GestionEtudiantMatiere.modeles.Subject;
import com.Dimsoft.GestionEtudiantMatiere.modeles.User;
import com.Dimsoft.GestionEtudiantMatiere.services.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@CrossOrigin("*")

public class UserControleur {
    
    private final UserService userService;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        int g=0;
        return userService.updateUser(user.getId_user(), user);

    }

    // @PutMapping("/updateUser/{idUser}")
    // public User updateUser(@PathVariable Long idUser, @RequestBody User user){
    //     return userService.updateUser(idUser, user);
    // }

    @DeleteMapping("/deleteUser/{idUser}")
    public String deleteUser(@PathVariable Long idUser){
        return userService.deleteUser(idUser);
    }

}
