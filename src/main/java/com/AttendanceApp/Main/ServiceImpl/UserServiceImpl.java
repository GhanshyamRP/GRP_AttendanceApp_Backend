package com.AttendanceApp.Main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceApp.Main.Model.User;
import com.AttendanceApp.Main.Repository.UserRepository;
import com.AttendanceApp.Main.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<User> getallusers(){
		return userRepo.findAll();
	}

	@Override
	public User getUserByUserame(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public User addUser(User u) {
		if(u.getPassword()!=null && u.getEmail()!= null && u.getMob()!=null && u.getUsername()!=null) {
			return userRepo.save(u);
		}
		return null;
	}
	
	

}
