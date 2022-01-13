/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.controll;

import com.crud.model.UserEntity;
import com.crud.service.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {
    
    private final UserDao userDao;

    
    @Autowired
    public UserController(UserDao userDao) {
        super();
        this.userDao = userDao;
    }
    
    
    
    @GetMapping("/home")
    public String Home(Model model){
        
        List<UserEntity> users = userDao.findBookAll();
        model.addAttribute("users", users);
        model.addAttribute("userForm", new UserEntity());
        return "display";
    }
    
    
    
    @PostMapping("/home")
    public String createUser(@ModelAttribute UserEntity userEntity, Model model) {
        
        userDao.createANewUser(userEntity);
        
        return "redirect:/home";
    }
}
