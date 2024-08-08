package com.registration.service;

import com.registration.Repository.RegistratonRepository;
import com.registration.entity.Student;
import com.registration.paylod.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RegistratonRepository registratonRepository;
    public StudentDto saveStudentReg(StudentDto studentDto) {
        Student student = mapToEntity(studentDto);

        Student student1 = registratonRepository.save(student);

        StudentDto studentDto1 = mapToDto(student1);

        return studentDto1;
    }

    public Student mapToEntity (StudentDto studentDto){
        Student map = modelMapper.map(studentDto, Student.class);
        return map;
    }

   public StudentDto mapToDto(Student student){
       StudentDto mapDto = modelMapper.map(student, StudentDto.class);
       return mapDto;
   }

}
