package com.ccqsantos.todolist.repository;

import com.ccqsantos.todolist.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {

    Aluno getById(Integer id);
}
