package com.AttendanceApp.Main.Service;

import java.util.List;

import com.AttendanceApp.Main.Model.User;

public interface UserService {

	List<User> getallusers();
	User addUser(User u);
	User getUserByUserame(String username);
}
