package com.example.TRANSVISION_BACKEND.Controller;

import com.example.TRANSVISION_BACKEND.Entities.Admin;
import com.example.TRANSVISION_BACKEND.Service.Admin_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class Admin_controller {

    @Autowired
    Admin_service Admin_Service;

    @GetMapping("/getAll")
    public ResponseEntity<List<Admin>> get_all_admin(){
        return Admin_Service.get_all();
    }

    @PostMapping("/add")
    public ResponseEntity<Boolean> create_admin(@RequestBody Admin admin){
        if(Admin_Service.create_admin(admin)){
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.OK);
    }

}
