package com.AttendanceApp.Main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.AttendanceApp.Main.Model.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer>{
	
	@Query(value = "Select * from attendance where user_id=:id && date = curdate()",nativeQuery = true)
	Attendance getmytodayrecord(int id);


	@Query(value = "Select * from attendance where user_id=:id && id=:eid",nativeQuery = true)
	Attendance findByUserId(int id);
	
	@Query(value = "Select * from attendance where user_id=:id ",nativeQuery = true)
	List<Attendance> findallattByUserId(int id);
	
	
}
