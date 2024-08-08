package com.registration.Repository;


import com.registration.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistratonRepository extends JpaRepository<Student,Long> {
}
