package ru.tadzh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tadzh.entity.Student;

/*
Используем методы репозитория для доступа к сущности "Student" в БД
 */

public interface StudentRepository extends JpaRepository<Student, Long> {
}
