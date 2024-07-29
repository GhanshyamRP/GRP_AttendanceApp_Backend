package com.AttendanceApp.Main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AttendanceApp.Main.Model.Entry;
import com.AttendanceApp.Main.Model.User;
import com.AttendanceApp.Main.Service.EntryService;

@RestController
@RequestMapping("entry")
@CrossOrigin (origins = "http://localhost:4200")
public class EntryController {
	
	@Autowired
	EntryService entryServ;
	@PostMapping("add")
	public Entry postEntry(@RequestBody Entry e){
		return entryServ.addEntry(e);
	}

}
