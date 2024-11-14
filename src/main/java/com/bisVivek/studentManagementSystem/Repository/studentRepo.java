package com.bisVivek.studentManagementSystem.Repository;

import com.bisVivek.studentManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository <Student, Long>{
}
