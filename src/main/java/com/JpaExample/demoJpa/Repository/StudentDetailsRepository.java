package com.JpaExample.demoJpa.Repository;

import com.JpaExample.demoJpa.model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Long> {

}