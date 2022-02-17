package ru.tadzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.tadzh.dto.StudentDto;
import ru.tadzh.entity.Student;
import ru.tadzh.service.StudentService;

import java.util.List;

/*
Обработка запросов пользователя направленных на работу с Студентами
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //    Отображение страницы содержащей всю информацию про Студентов
    @GetMapping
    public List<StudentDto> findAll() {
        return studentService.findAll();
    }

    //    Редактирование Студента
    @GetMapping("/{id}")
    public StudentDto editStudent(@PathVariable("id") Long id) throws Exception {
        return studentService.findById(id)
                .orElseThrow(() -> new Exception("Student with id = " + id + " not exists"));
    }

    //    Создание нового Студента
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentDto newStudent(@RequestBody StudentDto studentDto) {
        if (studentDto.getId() != null) {
            throw new IllegalArgumentException("Can't create user with id not null");
        }
         studentService.save(studentDto);
        return studentDto;
    }

    //    Сохранение нового или сохранение изменений в Студенте
    @PutMapping
    public StudentDto updateStudent(@RequestBody StudentDto studentDto) {
        if (studentDto.getId() == null) {
            throw new IllegalArgumentException("Can't update user with id null");
        }
        studentService.save(studentDto);
        return studentDto;
    }

    //    Удаление Студента
    @DeleteMapping("/{id}/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteById(id);
    }
}
