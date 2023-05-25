package com.ict.Spring_Boot_CRUD.Controller;

import com.ict.Spring_Boot_CRUD.dto.UserDTO;
import com.ict.Spring_Boot_CRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {


    @Autowired
    private UserService userService;

       @GetMapping("/getusers")
    public List<UserDTO> getUser(){

        return userService.getAllUsers();
    }
    @PostMapping("/saveuser")
    public UserDTO  saveUser(@RequestBody UserDTO userDTO){
            return userService.saveUser(userDTO);
    }


    @PutMapping("/updateuser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }


        @DeleteMapping("/deleteuser")
    public boolean DeleteUser(UserDTO userDTO){
           return userService.deleteUser(userDTO);
        }
}
