package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Model;

public interface Repository extends JpaRepository<Model, String>{
}
