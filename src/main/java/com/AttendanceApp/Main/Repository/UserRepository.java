package com.AttendanceApp.Main.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.AttendanceApp.Main.Model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
