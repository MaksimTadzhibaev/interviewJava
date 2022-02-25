package ru.tadzh.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
Транспорт информации в нужном нам виде из БД в сервисный слой
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Long id;

    private String name;

    private Integer age;
}
