package com.example.project2.repository;

import com.example.project2.model.Student;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT COUNT(s.groups.id) FROM Student s WHERE s.groups.id=?1")
    Long countByIdTeacher(Long id);

    @Query("SELECT s FROM Student s")
    List<Student>getByPagination(PageRequest pageRequest);
    @Query("SELECT s FROM Student s WHERE UPPER(s.firstName) LIKE concat(' % ', :text, ' %')" +
            "OR UPPER(s.lastName) LIKE concat(' %', :text, '%') OR UPPER(s.email) LIKE concat('%', :text, '%')")
    List<Student> searchAndPagination(@Param("text") String text, PageRequest pageable);

    @Override
    long count();
}
