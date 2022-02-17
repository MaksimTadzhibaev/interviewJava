package ru.tadzh.lesson7.dto;

/*
Транспорт информации в нужном нам виде из БД в сервисный слой
 */


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Long id;

    private String name;

    private Integer age;
}
