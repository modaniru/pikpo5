package com.example.demo.repository;

import com.example.demo.model.dao.Appointment;
import com.example.demo.model.dao.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    List<Appointment> findAllByPatient(Patient patient);
}
