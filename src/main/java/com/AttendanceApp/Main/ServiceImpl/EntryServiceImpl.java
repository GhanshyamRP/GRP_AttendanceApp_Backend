package com.AttendanceApp.Main.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceApp.Main.Model.Entry;
import com.AttendanceApp.Main.Repository.EntryRepository;
import com.AttendanceApp.Main.Service.EntryService;

@Service
public class EntryServiceImpl implements EntryService{

	@Autowired
	EntryRepository entryRepo;
	@Override
	public Entry addEntry(Entry e) {
		return entryRepo.save(e);
	}
	

}
