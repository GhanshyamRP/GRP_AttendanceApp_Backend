package com.AttendanceApp.Main.Service;

import org.springframework.stereotype.Service;

import com.AttendanceApp.Main.Model.Entry;

@Service
public interface EntryService {
	
	Entry addEntry(Entry e);

}
