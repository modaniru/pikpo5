package com.example.demo.model.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "processed_data_patient")
@Data
@ToString
public class Patient {
    @Id
    @Column(name = "patient_id")
    private Integer patientId;
    private String firstname;
    private String lastname;
}
