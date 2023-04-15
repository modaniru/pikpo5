package com.example.demo.services;

import com.example.demo.model.Appointment;
import com.example.demo.model.Patient;
import com.example.demo.repos.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    public void save(Appointment appointment){
        appointmentRepository.save(appointment);
    }
    public List<Appointment> getAll(){
        return appointmentRepository.findAll();
    }
    public List<Appointment> findAllByPatient(Patient patient){
        return appointmentRepository.findAllByPatient(patient);
    }
}
