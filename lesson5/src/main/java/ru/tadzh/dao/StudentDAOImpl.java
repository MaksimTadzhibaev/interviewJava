package ru.tadzh.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.tadzh.util.SFactory;
import ru.tadzh.entity.Student;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    SessionFactory sessionFactory = SFactory.getSessionFactory();

    //       CREATE (INSERT (внесение данных в таблицу))
    public void insert (Student student){
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(student);
        session.getTransaction().commit();
        session.close();
    }

    //        READ (SELECT BY ID (получение данных по id)
    public Student findById (Long id){
        Session session = sessionFactory.openSession();
        Student product = session.find(Student.class, id);
        session.close();
        return product;
    }

    //        READ (SELECT ALL (плучение всех данных таблицы)
    public List<Student> findAll(){
        Session session = sessionFactory.openSession();
        List <Student> allProducts = session.createQuery("select s from Student s", Student.class).getResultList();
        session.close();
        return allProducts;
    }

    //        UPDATE (обновление данных в существующим поле или создание нового при отсутствии данных)
    public Student saveOrUpdate (Student student) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.merge(student);
        session.getTransaction().commit();
        session.close();
        return student;
    }

    //        DELETE (удаление данных по id)
    public void deleteById (Long id) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.remove(session.getReference(Student.class, id));
        session.getTransaction().commit();
        session.close();
    }
}

