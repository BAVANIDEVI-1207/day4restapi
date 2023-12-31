package com.example.project.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Model;
import com.example.project.service.DetService;


@RestController
public class Controller{
	@Autowired
	DetService ser;
	
	@PostMapping("add")
	public Model adddetails(@RequestBody Model m) {
		return ser.getde(m);
	}

	@GetMapping("show")
	public List<Model> showdetails(){
		return ser.show();
	}
	@PutMapping("update")
	public Model change(@RequestBody Model m) {
		return ser.update(m);
	}
	@DeleteMapping("del")
	public void delete(@RequestBody Model m) {
		ser.deletede(m);
	}
	
	
	

}
