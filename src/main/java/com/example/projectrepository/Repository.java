package com.example.projectrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Model;


public interface Repository extends JpaRepository<Model, Integer> {

}
