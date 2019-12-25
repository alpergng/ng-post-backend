package com.gungor.alper.ngpostbackend.ngpostbackend.controller;

import com.gungor.alper.ngpostbackend.ngpostbackend.dto.AdminResponse;
import com.gungor.alper.ngpostbackend.ngpostbackend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ag on 25.12.2019
 */
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/get")
    public ResponseEntity<AdminResponse> getSinglePost(){
        if(adminService.isAdmin()){
            return new ResponseEntity<>(adminService.getAdminResponse(), HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/{username}")
    public ResponseEntity deleteSinglePost(@PathVariable @RequestBody String username){
        adminService.deleteByUserName(username);
        return new ResponseEntity(HttpStatus.OK);
    }
}
