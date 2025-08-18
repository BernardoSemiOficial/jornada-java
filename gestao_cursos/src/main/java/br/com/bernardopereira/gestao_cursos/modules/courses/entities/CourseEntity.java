package br.com.bernardopereira.gestao_cursos.modules.courses.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.bernardopereira.gestao_cursos.modules.users.entities.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@Entity(name = "courses")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String title;
  private String description;

  @Column(name = "created_at")
  private LocalDateTime createdAt;
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  @ManyToOne
  @JoinColumn(name = "instructor_id", insertable = false, updatable = false)
  private UserEntity instructor;
  
  @Column(name = "instructor_id")
  private UUID instructorId;
}
