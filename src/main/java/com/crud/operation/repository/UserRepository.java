package com.crud.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crud.operation.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value="select * from user where mobile_no=?1 and fName=?2",nativeQuery=true)
	User getUserDetailsByMobileName(String mobileNumber,String firstName);
}
