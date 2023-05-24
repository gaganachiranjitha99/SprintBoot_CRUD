package com.ict.Spring_Boot_CRUD.service;


import com.ict.Spring_Boot_CRUD.dto.UserDTO;
import com.ict.Spring_Boot_CRUD.entity.User;
import com.ict.Spring_Boot_CRUD.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }


}
