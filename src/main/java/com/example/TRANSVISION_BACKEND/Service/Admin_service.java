package com.example.TRANSVISION_BACKEND.Service;

import com.example.TRANSVISION_BACKEND.Entities.Admin;
import com.example.TRANSVISION_BACKEND.Repository.Admin_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Admin_service {
    @Autowired
    Admin_repository Admin_repo;
    public ResponseEntity<List<Admin>> get_all(){
        return new ResponseEntity<>(Admin_repo.findAll(), HttpStatus.OK);
    }

    public boolean create_admin(Admin admin){
        try{
            Admin_repo.save(admin);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }


}
