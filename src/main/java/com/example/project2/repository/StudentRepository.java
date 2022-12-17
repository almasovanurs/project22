package com.example.project2.repository;

import com.example.project2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT COUNT(s.groups.id) FROM Student s WHERE s.groups.id=?1")
    Long countByIdTeacher(Long id);

    @Override
    long count();
}
