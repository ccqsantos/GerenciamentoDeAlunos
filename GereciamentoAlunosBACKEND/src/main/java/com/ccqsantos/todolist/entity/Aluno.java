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

    private String matricula;

    private String name;

    private Date birthDate;

    private Course course;

    public Aluno(){
    }

    public Aluno(Integer id, String matricula, String name, Date birthDate, Course course) {
        this.id = id;
        this.matricula = matricula;
        this.name = name;
        this.birthDate = birthDate;
        this.course = course;
    }

    public Aluno(int i, String estudarJava) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
