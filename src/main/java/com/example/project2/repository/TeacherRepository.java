package com.example.project2.repository;


import com.example.project2.model.Teacher;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Override
    <S extends Teacher> long count(Example<S> example);
}
