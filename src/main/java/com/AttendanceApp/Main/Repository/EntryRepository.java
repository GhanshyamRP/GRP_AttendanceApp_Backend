package com.AttendanceApp.Main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AttendanceApp.Main.Model.Entry;

public interface EntryRepository extends JpaRepository<Entry, Integer> {

}
