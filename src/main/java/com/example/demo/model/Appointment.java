package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "processed_data_appointment")
@Data
@ToString
public class Appointment {
    @Id
    @Column(name = "appointment_id")
    private Integer id;
    private String dateTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
