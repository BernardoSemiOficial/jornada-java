package br.com.bernardopereira.gestao_cursos.modules.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bernardopereira.gestao_cursos.exceptions.ValidationException;
import br.com.bernardopereira.gestao_cursos.modules.courses.dto.CreateCourseRequest;
import br.com.bernardopereira.gestao_cursos.modules.courses.useCases.CreateCourseUseCase;


@RestController
@RequestMapping("/courses")
public class CoursesController {

  @Autowired
  private CreateCourseUseCase createCourseUseCase;
  
  @PostMapping()
  private ResponseEntity<?> createCourses(@RequestBody CreateCourseRequest course) {
    try {
      String response = this.createCourseUseCase.execute(course);
      return ResponseEntity.ok(response);
    } catch (ValidationException e) {
      return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(e.getMessage());
    }
    catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
    
  }
}
