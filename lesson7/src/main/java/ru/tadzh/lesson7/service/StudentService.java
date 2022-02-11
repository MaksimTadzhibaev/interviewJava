package ru.tadzh.lesson7.service;

import ru.tadzh.lesson7.dto.StudentDto;

import java.util.List;
import java.util.Optional;

    /*
Интерфейс для реализации сервисного слоя
 */

public interface StudentService {

        List<StudentDto> findAll();

        Optional<StudentDto> findById(Long id);

        void save(StudentDto authorsDto);

        void deleteById(Long id);
    }

