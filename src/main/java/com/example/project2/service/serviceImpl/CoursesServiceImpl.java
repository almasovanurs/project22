package com.example.project2.service.serviceImpl;

import com.example.project2.dto.request.CourseRequest;
import com.example.project2.dto.response.CourseResponse;
import com.example.project2.dto.response.CourseResponseView;
import com.example.project2.model.Company;
import com.example.project2.model.Courses;
import com.example.project2.repository.CompanyRepository;
import com.example.project2.repository.CoursesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesServiceImpl {
    private final CompanyRepository companyRepository;
    private final CoursesRepository coursesRepository;

    @Autowired
    public CoursesServiceImpl(CompanyRepository companyRepository, CoursesRepository coursesRepository) {
        this.companyRepository = companyRepository;
        this.coursesRepository = coursesRepository;
    }

    public Courses create(CourseRequest request, Long companyId){
        //Company company = companyRepository.findById(companyId).get();
        Optional<Company> company = companyRepository.findById(companyId);
        Courses courses = new Courses();
        BeanUtils.copyProperties(request,courses);
        courses.setCourseName(request.getCourseName());
        courses.setDuration(request.getDurationMonth());
        courses.setCompanyId(request.getCompanyId());
        courses.setCompany(company.get());
        // request.setCompany(company.get());

        return    coursesRepository.save(courses);

    }

    public Courses update(Long id, CourseRequest request) {
        Optional<Courses> courses =coursesRepository.findById(id);
        if (courses.isEmpty()){
            System.out.println("Course id not found");
        }
        mapToUpdateCourse(courses.get(),request);
        return coursesRepository.save(courses.get());
    }

    public Courses getById(Long id) {
        return coursesRepository.findById(id).get();

    }

    public void deleteById(Long id) {
        Courses courses = coursesRepository.findById(id).get();
        coursesRepository.delete(courses);
    }

    public Courses mapToEntity(CourseRequest request) {
        Courses courses = new Courses();
        courses.setCourseName(request.getCourseName());
        courses.setDuration(request.getDurationMonth());
        courses.setCompanyId(request.getCompanyId());
        return courses;
    }

    public void mapToUpdateCourse(Courses courses, CourseRequest request) {
        courses.setCourseName(request.getCourseName());
        courses.setDuration(request.getDurationMonth());
        courses.setCompanyId(request.getCompanyId());

    }

    public CourseResponse studentResponse(Courses courses) {
        return CourseResponse.builder()
                .id(courses.getId())
                .courseName(courses.getCourseName())
                .durationMonth(courses.getDuration())
                .build();
    }

    public List<Courses> getAllStudents() {

        return coursesRepository.findAll();
    }
    public CourseResponseView getAllStudentsPagination(String text, int page, int size){
        CourseResponseView responseView = new CourseResponseView();
        PageRequest pageable =  PageRequest.of(page -1, size);
        return responseView;
    }


}
