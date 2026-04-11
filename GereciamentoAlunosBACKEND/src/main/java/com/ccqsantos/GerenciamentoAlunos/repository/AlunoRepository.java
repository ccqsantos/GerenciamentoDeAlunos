package com.ccqsantos.GerenciamentoAlunos.repository;

import com.ccqsantos.GerenciamentoAlunos.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {

    Aluno getById(Integer id);
}
