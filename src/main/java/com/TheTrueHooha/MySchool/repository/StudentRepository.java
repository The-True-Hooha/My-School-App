package com.TheTrueHooha.MySchool.repository;
//interface create that extends from the Jpa Repo (Student, Long )

import com.TheTrueHooha.MySchool.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long>{

}
