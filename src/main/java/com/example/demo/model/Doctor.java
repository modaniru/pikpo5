package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;


@Entity
@Table(name = "processed_data_doctor")
@Data
@ToString
public class Doctor {
    @Id
    @Column(name = "doctor_id")
    private Integer id;
    private String firstname;
    private String lastname;
    private String specialization;
    private String contactInfo;
}
