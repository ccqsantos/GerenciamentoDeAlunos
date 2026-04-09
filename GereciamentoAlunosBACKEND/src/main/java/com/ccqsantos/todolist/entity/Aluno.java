package com.ccqsantos.todolist.entity;

import jakarta.persistence.*;

import java.lang.annotation.Target;
import java.sql.Date;

@Entity
@Table(name = "alunos")
public class Aluno {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Date birthDate;

    private Course course;

    private String matricula;

    public Aluno(){
    }

    public Aluno(Integer id, String matricula, String name, Date birthDate, Course course) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.course = course;
        this.matricula = matricula;
    }

    public Aluno(String i) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
