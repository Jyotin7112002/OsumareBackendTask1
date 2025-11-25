package com.OsumareCompanyBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OsumareCompanyBackend.Entity.User;
@Repository
public interface Repo extends JpaRepository<User,Long> {


	 

	
}
