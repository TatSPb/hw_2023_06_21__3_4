package hw_2023_06_21__3_4.repository;

import hw_2023_06_21__3_4.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> findAllByColor(String color);
    List<Faculty> findByColorContainingIgnoreCaseOrNameContainingIgnoreCase(String color, String name);
}
