package com.example.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Model;
import com.example.crud.service.Service;

@RestController
@RequestMapping("/vendor")
public class Controller {
    Service service;
    
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("{vendorId}")
    public Model getModelDetails(@PathVariable("vendorId") String vendorId){
        return service.getVendor(vendorId);
    }

    @GetMapping("/")
    public List<Model> getAllModelDetails(){
        return service.getAllVendor();
    }

    @PostMapping
    public String createModelDetails(@RequestBody Model model){
        service.createVendor(model);
        return "Vendor created Successfully";

    }

    @PutMapping
    public String updateModelDetails(@RequestBody Model model){
        service.updateVendor(model);
        return "Vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteModelDetails(@PathVariable("vendorId") String vendorId){
        service.deleteVendor(vendorId);
        return "Vendor deleted Successfully";
    }
}
