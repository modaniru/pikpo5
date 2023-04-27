package com.example.demo.services;

import com.example.demo.model.dao.Patient;
import com.example.demo.repository.PatientRepository;
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
