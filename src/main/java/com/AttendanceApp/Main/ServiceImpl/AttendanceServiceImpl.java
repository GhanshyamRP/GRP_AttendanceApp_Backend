package com.AttendanceApp.Main.ServiceImpl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceApp.Main.Model.Attendance;
import com.AttendanceApp.Main.Model.User;
import com.AttendanceApp.Main.Repository.AttendanceRepository;
import com.AttendanceApp.Main.Service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired
	AttendanceRepository AttendanceRepo;
	
	
	@Override
	public Attendance getAttendanceById(int id) {
		return AttendanceRepo.findById(id).get();
	}

	@Override
	public Attendance updateAttendance( int id, Attendance u) {
		Attendance u1 = AttendanceRepo.findById(id).get();
		 if(u.getEntrylst()!=null) {
			 u1.setEntrylst(u.getEntrylst());
		 }
		return AttendanceRepo.save(u1);
	}

	@Override
	public Attendance getmytodayAttendance(int id){
		 Attendance at = AttendanceRepo.getmytodayrecord(id);
		 System.out.println("record for today for id number : "+id+at);
		if(at == null ){
			System.out.println("Today record not found");
			Date dt = Date.valueOf(LocalDate.now());
			System.out.println(dt);
			User u1 = new User(id);
			Attendance at1 = new Attendance(dt, u1);
			at = AttendanceRepo.save(at1);
			System.out.println("record for today for id number : "+id+at);
			return at;
		}else {
			at =AttendanceRepo.getmytodayrecord(id);
			return at;
		}
		 
	}

	@Override
	public List<Attendance> getmyallAttendance(int id) {
		return AttendanceRepo.findallattByUserId(id);
	}
}
