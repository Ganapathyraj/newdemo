package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	@PostMapping(value="/add")
	public String addinfo(@RequestBody StudentEntity se)  {
		return ss.addInfo(se);
	}

	@DeleteMapping(value="/delete/{id}") 
	public String one(@PathVariable int id) {
		return ss.one(id);
	

	}
	@GetMapping("/getall")
	public List<StudentEntity> getAll() {
		return ss.getAll();
	}

}
