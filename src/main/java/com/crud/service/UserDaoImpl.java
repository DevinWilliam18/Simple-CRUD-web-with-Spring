/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.service;

import com.crud.model.UserEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{

    List<UserEntity> userList = new ArrayList<>();
    
    @Override
    public List<UserEntity> findBookAll() {
        
        return userList;
    }

    @Override
    public void createANewUser(UserEntity userEntity) {
        
        UserEntity user = new UserEntity();
        
        user.setId(UUID.randomUUID().toString());
        user.setUserEmail(String.valueOf(userEntity.getUserEmail()));
        user.setUserName(userEntity.getUserName());
        user.setQty(Integer.valueOf(userEntity.getQty()));
        
      
        userList.add(user);
    }
    
}
