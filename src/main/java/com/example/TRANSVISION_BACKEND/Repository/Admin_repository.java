package com.example.TRANSVISION_BACKEND.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.TRANSVISION_BACKEND.Entities.Admin;

@Repository
public interface Admin_repository extends JpaRepository<Admin,String> {

}
