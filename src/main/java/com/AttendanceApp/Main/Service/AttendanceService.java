package com.AttendanceApp.Main.Service;

import java.util.List;

import com.AttendanceApp.Main.Model.Attendance;

public interface AttendanceService {
	
	
	Attendance getAttendanceById(int id);
	Attendance updateAttendance(int id , Attendance u);
	Attendance getmytodayAttendance(int id);
	List<Attendance> getmyallAttendance(int id);

}
