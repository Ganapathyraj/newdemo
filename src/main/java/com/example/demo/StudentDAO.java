package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	@Autowired
	StudentRepo sr;
	public String addInfo(StudentEntity se) {
	sr.save(se);
	return "data Added Succesfully";
	
	}
	public String one(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		return "deleted";
	}
	public List<StudentEntity> getAll() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
