package hw_2023_06_21__3_4.mapper;

import hw_2023_06_21__3_4.dto.*;
import hw_2023_06_21__3_4.entity.*;
import org.springframework.stereotype.Component;

@Component
public class FacultyMapper {

    public FacultyDtoOut toDto(Faculty faculty) {
        FacultyDtoOut facultyDtoOut = new FacultyDtoOut();
        facultyDtoOut.setId(faculty.getId());
        facultyDtoOut.setName(faculty.getName());
        facultyDtoOut.setColor(faculty.getColor());
        return facultyDtoOut;
    }

    public Faculty toEntity(FacultyDtoIn facultyDtoIn) {
        Faculty faculty = new Faculty();
        faculty.setName(faculty.getName());
        faculty.setColor(faculty.getColor());
        return faculty;
    }
}
