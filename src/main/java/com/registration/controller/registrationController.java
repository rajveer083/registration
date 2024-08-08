package com.registration.controller;

import com.registration.paylod.StudentDto;
import com.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//http://localhost:8080/api/registration
@RestController
@RequestMapping("/api/registration")
@CrossOrigin("http://localhost:4200")
public class registrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<StudentDto> saveRegistration(@RequestBody StudentDto studentDto){
        StudentDto studentDto1 = registrationService.saveStudentReg(studentDto);
        return  new ResponseEntity<>(studentDto1, HttpStatus.CREATED);
    }
}
