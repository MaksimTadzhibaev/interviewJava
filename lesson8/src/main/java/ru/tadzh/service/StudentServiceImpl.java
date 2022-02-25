package ru.tadzh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tadzh.dto.StudentDto;
import ru.tadzh.entity.Student;
import ru.tadzh.repository.StudentRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Слой получения данных из репозитория, обработка и отправка контроллеру
 */

@Service
public class StudentServiceImpl implements StudentService{

    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Получение списка всех студентов
    @Override
    public List<StudentDto> findAll() {
        return studentRepository.findAll().stream()
                .map(student -> new StudentDto(student.getId(), student.getName(), student.getAge()))
                .collect(Collectors.toList());
    }

    // Получение студента по id
    @Override
    public Optional<StudentDto> findById(Long id) {
        return studentRepository.findById(id)
                .map(student -> new StudentDto(student.getId(), student.getName(), student.getAge()));
    }

    // Сохранение нового или обновление данных в существующем студенте
    @Override
    public void save(StudentDto studentDto) {
        Student student = new Student(studentDto.getId(), studentDto.getName(), studentDto.getAge());
        studentRepository.save(student);
    }

    // Удаление студента по id
    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
