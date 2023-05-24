package com.ict.Spring_Boot_CRUD.Controller;

import com.ict.Spring_Boot_CRUD.dto.UserDTO;
import com.ict.Spring_Boot_CRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {


    @Autowired
    private UserService userService;

       @GetMapping("/getuser")
    public String getUser(){

        return "hello gagana";
    }
    @PostMapping("/saveuser")
    public UserDTO  saveUser(@RequestBody UserDTO userDTO){
            return userService.saveUser(userDTO);
    }


    @PutMapping("/updateuser")
    public String updateUser(){
        return "User updated";
    }


        @DeleteMapping("/deleteuser")
    public String DeleteUser(){
           return " User deeted";
        }
}
