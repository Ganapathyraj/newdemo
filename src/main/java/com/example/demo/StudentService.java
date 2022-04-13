package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
@Autowired

    StudentDAO sd;
	public String addInfo(StudentEntity se) {
		
		// TODO Auto-generated method stub
		return sd.addInfo(se);
	}
	public String one(int id) {
		// TODO Auto-generated method stub
		return sd.one(id);
	}
	public List<StudentEntity> getAll() {
		// TODO Auto-generated method stub
		return sd.getAll();
	}

}
