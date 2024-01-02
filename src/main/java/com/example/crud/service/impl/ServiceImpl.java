package com.example.crud.service.impl;
import java.util.List;

import com.example.crud.model.Model;
import com.example.crud.repository.Repository;
import com.example.crud.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    Repository repository;

    public ServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public String createVendor(Model model) {
        repository.save(model);
        return "Created Success";
    }

    @Override
    public String deleteVendor(String vendorId) {
        repository.deleteById(vendorId);
        return "Deleted Successfully";
    }

    @Override
    public List<Model> getAllVendor() {
        return repository.findAll();
    }

    @Override
    public Model getVendor(String vendorId) {
        return repository.findById(vendorId).get(); 
    }

    @Override
    public String updateVendor(Model model) {
        repository.save(model);
        return "Updated success";
    }
    
}
