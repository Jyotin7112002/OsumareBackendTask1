package com.OsumareCompanyBackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.OsumareCompanyBackend.Entity.User;
import com.OsumareCompanyBackend.Repository.Repo;




@Service
public class userServices {
	
	@Autowired
	private Repo repository;

	public User createUser(User user) {
		
		return repository.save(user);
	}
	
	 public User getuUser(Long id) {
	        return repository.findById(id)
	                .orElseThrow(() -> new RuntimeException("user not found with id " + id));
	    }
	 
	 public  List<User> getAllUser() {
		
	        return repository.findAll();
	    }

	 
	 public User updateUser(Long id, User user) {
	        User existingUser = getuUser(id);

	        existingUser.setName(user.getName());
	        existingUser.setEmail(user.getEmail());
	        existingUser.setPassword(user.getPassword());

	        CrudRepository<User, Long> userRepository;
			return repository.save(existingUser);
	 }
	
	 public void deleteUser(Long id) {
	        repository.deleteById(id);
	    }

}
