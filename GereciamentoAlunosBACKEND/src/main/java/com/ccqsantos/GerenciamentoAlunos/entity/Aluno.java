package com.ccqsantos.GerenciamentoAlunos.entity;

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

    private String hash;

    @Transient
    private String password;

    public Aluno(){
    }

    public Aluno(Integer id, String name, Date birthDate, Course course, String matricula, String hash) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.course = course;
        this.matricula = matricula;
        this.hash = hash;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHash(){
        return hash;
    }

    public void setHash(String hash){
        this.hash = hash;
    }
}
