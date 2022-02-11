package ru.tadzh.lesson7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.tadzh.lesson7.dto.StudentDto;
import ru.tadzh.lesson7.service.StudentService;

import javax.validation.Valid;

/*
Обработка запросов пользователя направленных на работу с Студентами
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //    Отображение страницы содержащей всю информацию про Студентов
    @GetMapping
    public String listPageStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students";
    }

    //    Создание нового Студента
    @GetMapping("/new")
    public String newStudentForm(Model model) {
        model.addAttribute("students", new StudentDto());
        return "student_form";
    }

    //    Редактирование Студента
    @GetMapping("/{id}")
    public String editStudent(@PathVariable("id") Long id, Model model) {
        model.addAttribute("students", studentService.findById(id));
        return "student_form";
    }

    //    Сохранение нового или сохранение изменений в Студенте
    @PostMapping
    public String updateStudent(@Valid StudentDto studentDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "student_form";
        }
        studentService.save(studentDto);
        return "redirect:/student";
    }

    //    Удаление Студента
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteById(id);
        return "redirect:/student";
    }
}
