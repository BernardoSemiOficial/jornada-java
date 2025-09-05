package br.com.bernardopereira.gestao_cursos.modules.courses;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bernardopereira.gestao_cursos.exceptions.ValidationException;
import br.com.bernardopereira.gestao_cursos.modules.courses.dto.CreateCourseRequest;
import br.com.bernardopereira.gestao_cursos.modules.courses.useCases.CreateCourseUseCase;
import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/courses")
public class CoursesController {

  @Autowired
  private CreateCourseUseCase createCourseUseCase;
  
  @PostMapping()
  @PreAuthorize("hasRole('TEACHER')")
  private ResponseEntity<?> createCourses(HttpServletRequest request, @RequestBody CreateCourseRequest course) {
    UUID instructorId = UUID.fromString(request.getAttribute("userId").toString());
    
    try {
      String response = this.createCourseUseCase.execute(course, instructorId);
      return ResponseEntity.ok(response);
    } catch (ValidationException e) {
      return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(e.getMessage());
    }
    catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
    
  }
}
