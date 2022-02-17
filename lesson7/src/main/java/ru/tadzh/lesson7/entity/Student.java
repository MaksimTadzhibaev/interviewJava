package ru.tadzh.lesson7.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/*
Описание сущности "студент"
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idStudent")
    private Long id;

    @Column (name = "NameStudent")
    private String name;

    @Column (name = "AgeStudent")
    private Integer age;

}
