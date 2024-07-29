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

import com.AttendanceApp.Main.Model.Attendance;
import com.AttendanceApp.Main.Service.AttendanceService;


@RestController
@RequestMapping("attendance")
@CrossOrigin (origins = "http://localhost:4200")
public class AttendanceController {
	
	
	@Autowired
	AttendanceService AttendanceServ;
	
	@GetMapping ("{id}")
	public Attendance gettodayAttendance(@PathVariable  int id){
		return AttendanceServ.getmytodayAttendance(id);
	}
	
	@GetMapping ("list/{id}")
	public List<Attendance> getAttendanceReport(@PathVariable int id){
		return AttendanceServ.getmyallAttendance(id);
	}
	
	
	@PutMapping("updateSignIn/{id}")
	public Attendance updateAttendanceIn(@PathVariable int id, @RequestBody Attendance u){
		return AttendanceServ.updateAttendance(id, u);
	}


	@PutMapping("updateSignOut/{id}")
	public Attendance updateAttendanceOut(@PathVariable int id, @RequestBody Attendance u){
		return AttendanceServ.updateAttendance(id, u);
	}
	

}
