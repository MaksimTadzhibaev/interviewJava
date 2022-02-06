package ru.tadzh.dao;

import ru.tadzh.entity.Student;
import java.util.List;

public interface StudentDAO {

    void insert (Student student);

    Student findById (Long id);

    List<Student> findAll();

    Student saveOrUpdate (Student student);

    void deleteById (Long id);
}
