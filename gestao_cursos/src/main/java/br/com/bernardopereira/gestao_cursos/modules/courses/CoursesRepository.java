package br.com.bernardopereira.gestao_cursos.modules.courses;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bernardopereira.gestao_cursos.modules.courses.entities.CourseEntity;

@Repository
public interface CoursesRepository extends JpaRepository<CourseEntity, UUID> {  
}
