package br.com.bernardopereira.gestao_cursos.modules.courses.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bernardopereira.gestao_cursos.exceptions.ValidationException;
import br.com.bernardopereira.gestao_cursos.modules.courses.CoursesRepository;
import br.com.bernardopereira.gestao_cursos.modules.courses.dto.CreateCourseRequest;
import br.com.bernardopereira.gestao_cursos.modules.courses.entities.CourseEntity;
import br.com.bernardopereira.gestao_cursos.modules.users.UserRepository;

@Service
public class CreateCourseUseCase {
  
  @Autowired
  private CoursesRepository coursesRepository;

  @Autowired
  private UserRepository userRepository;

  public String execute(CreateCourseRequest course, UUID instructorId) throws ValidationException {

    if(!this.userRepository.existsById(instructorId)) {
      throw new ValidationException("O instrutor informado não existe.");
    }

    if(course.getTitle() == null || course.getTitle().isEmpty() || course.getDescription() == null || course.getDescription().isEmpty() || instructorId == null) {
      throw new ValidationException("O título, descrição e instrutor são obrigatórios.");
    }

    CourseEntity createCourse = CourseEntity.builder()
      .title(course.getTitle())
      .description(course.getDescription())
      .instructorId(instructorId)
      .build();

    CourseEntity response = this.coursesRepository.save(createCourse);

    return response.getId().toString();
  }
}
