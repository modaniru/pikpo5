package com.example.demo.controller;

import com.example.demo.model.Appointment;
import com.example.demo.model.ModelRequest;
import com.example.demo.model.Patient;
import com.example.demo.services.AppointmentService;
import com.example.demo.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/mvc/v1/")
public class MainController {
    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private PatientService patientService;


    @GetMapping("/form")
    public String test(Model model){
        model.addAttribute("modelRequest", new ModelRequest());
        return "main.html";
    }

    @PostMapping("/form")
    public String getAppointments(@ModelAttribute ModelRequest modelRequest, Model model){
        if(modelRequest.getId() == null) return "main.html";
        Patient patientById = patientService.getPatientById(modelRequest.getId());
        if(Objects.isNull(patientById)) return "main.html";
        List<Appointment> allByPatient = appointmentService.findAllByPatient(patientById);
        model.addAttribute("modelRequest", new ModelRequest());
        model.addAttribute("patient", patientById);
        model.addAttribute("appointments", allByPatient);
        return "appointments.html";
    }
}
