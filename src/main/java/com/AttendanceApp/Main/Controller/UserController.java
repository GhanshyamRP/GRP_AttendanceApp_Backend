package com.AttendanceApp.Main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AttendanceApp.Main.Model.User;
import com.AttendanceApp.Main.Service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin (origins = "http://localhost:4200")
public class UserController {


	@Autowired
	UserService userServ;
	
	@GetMapping ("list")
	public List<User> getalluser(){
		return userServ.getallusers();
	}
	
	@PostMapping("add")
	public User postuser(@RequestBody User u){
		return userServ.addUser(u);
	}
	
	

	

}
