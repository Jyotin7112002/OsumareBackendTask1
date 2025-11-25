package com.OsumareCompanyBackend.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OsumareCompanyBackend.Entity.User;
import com.OsumareCompanyBackend.Service.userServices;



@RestController
@RequestMapping("/users")
public class UserController {


		@Autowired
	    private  userServices services;



	    // CREATE
	    @PostMapping
	    public User createUser(@RequestBody User user) {
	        return services.createUser(user);
	    }

    // GET BY ID
     @GetMapping("/{id}")
      public User getUser(@PathVariable Long id) {
	        return services.getuUser(id);
	    }

	    // GET ALL
	    
	    @GetMapping
	    public List<User> getAll() {
	        return services.getAllUser();
	    }

	    // UPDATE
	    @PutMapping("/{id}")
	    public User updateUser(@PathVariable Long id, @RequestBody User user) {
	    	return services.updateUser(id, user);
	    }
	    

	    // DELETE
	    @DeleteMapping("/{id}")
	    public String deleteUser(@PathVariable Long id) {
	        services.deleteUser(id);
	        return "User deleted successfully!";
	    }
	}

	
	

