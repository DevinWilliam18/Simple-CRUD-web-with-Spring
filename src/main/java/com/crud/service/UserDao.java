/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.service;

import com.crud.model.UserEntity;
import java.util.List;

/**
 *
 * @author USER
 */
public interface UserDao {
    public List<UserEntity> findBookAll();
    public void createANewUser(UserEntity userEntity);
    
}
