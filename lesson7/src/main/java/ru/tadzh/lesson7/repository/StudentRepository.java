package ru.tadzh.lesson7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tadzh.lesson7.entity.Student;

/*
Используем методы репозитория для доступа к сущности "Student" в БД
 */

public interface StudentRepository extends JpaRepository<Student, Long> {
}
