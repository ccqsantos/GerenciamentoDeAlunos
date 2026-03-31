package com.ccqsantos.todolist.services;

import com.ccqsantos.todolist.entity.Aluno;
import com.ccqsantos.todolist.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository repository;

    public Aluno create(Aluno aluno){
        return repository.save(aluno);
    }

    public Aluno getAlunoById(Integer id){
        return repository.getById(id);
    }

    public List<Aluno> findAll(){
        return (List<Aluno>) repository.findAll();
    }

    public Aluno editAluno(Integer id, Aluno updated){
        Aluno aluno =  getAlunoById(id);
        if (updated.getName() != null){
            aluno.setName(updated.getName());
        }
        if (updated.getBirthDate() != null){
            aluno.setBirthDate(updated.getBirthDate());
        }
        if (updated.getName() != null){
            aluno.setName(updated.getName());
        }
        if (updated.getCourse() != null){
            aluno.setCourse(updated.getCourse());
        }
        return repository.save(aluno);
    }

    public void deleteAluno(Integer id){
        repository.deleteById(id);
    }

}
