package com.example.crud.service;

import java.util.List;

import com.example.crud.model.Model;

public interface Service {
    public String createVendor(Model model);
    public String updateVendor(Model model);
    public String deleteVendor(String vendorId);
    public Model getVendor(String vendorId);
    public List<Model> getAllVendor();
}
