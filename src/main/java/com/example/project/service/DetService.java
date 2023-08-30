package com.example.project.service;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Model;
import com.example.projectrepository.Repository;

@Service

public class DetService {
	@Autowired
	Repository rep;
	

	public Model getde(Model m) {
		return rep.save(m);
	}
	//get
	public List<Model> show(){
		return rep.findAll();
	}
	//get by id
	public Optional<Model>showde(int id){
		return rep.findById(id);
	}
	

	//update
	public Model update(Model m) {
		 return rep.saveAndFlush(m);
	}
	public String update(int id) {
//		return rep.saveAndFlush(m);
		if(rep.existsById(id)) {
			return "Updated";
		}
		else {
			return "Enter valid id";
		}
	}
	//delete
	public void deletede(Model m) {
		rep.delete(m);
	}
	public void delid(int id) {
		rep.deleteById(id);
	}
	

}
