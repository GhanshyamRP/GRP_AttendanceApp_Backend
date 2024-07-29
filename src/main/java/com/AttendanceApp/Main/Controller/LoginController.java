package com.AttendanceApp.Main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AttendanceApp.Main.Model.Err;
import com.AttendanceApp.Main.Model.Login;
import com.AttendanceApp.Main.Model.User;
import com.AttendanceApp.Main.Service.UserService;


@RestController
@RequestMapping("login")
@CrossOrigin (origins = "http://localhost:4200")
public class LoginController {


	@Autowired
	UserService userServ;
	
	@PostMapping
	public ResponseEntity<?> login(@RequestBody Login l){
		System.out.println(l);
		User u1 = userServ.getUserByUserame(l.getUsername());
		System.out.println(u1);
		if (u1!=null && u1.getUsername().equals(l.getUsername())) {
			System.out.println("User found");
			
			if(u1.getPassword().equals(l.getPassword())) {
				System.out.println("Password matched");
				return new ResponseEntity<User>(u1, HttpStatus.ACCEPTED);
			}else {
				System.out.println("Password not matched");
				return new ResponseEntity<Err>(new Err("Password not matched"),HttpStatus.OK);
			}
			
		}else {
			System.out.println("User not found");
			return new ResponseEntity<Err>(new Err("User Not Found"),HttpStatus.OK);
		}
		
		
	}
}
