package ru.tadzh;

import ru.tadzh.dao.StudentDAO;
import ru.tadzh.dao.StudentDAOImpl;
import ru.tadzh.entity.Student;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAOImpl = new StudentDAOImpl();

        for (int i = 0; i < 1000; i++) {
            studentDAOImpl.insert(new Student(null, "Student"+i, 19));
        }

        System.out.println(studentDAOImpl.findById(10L));

        studentDAOImpl.deleteById(10L);

        studentDAOImpl.saveOrUpdate(new Student(8L, "Maksim", 32));

        System.out.println(studentDAOImpl.findAll());
    }
}
