package com.example.demo.services;

import com.example.demo.model.Patient;
import com.example.demo.repos.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    public Patient getPatientById(Integer id){
        return patientRepository.findById(id).orElse(null);
    }
}
