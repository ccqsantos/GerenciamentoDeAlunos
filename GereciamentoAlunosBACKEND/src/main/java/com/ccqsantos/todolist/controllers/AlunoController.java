package com.ccqsantos.todolist.controllers;

import com.ccqsantos.todolist.entity.Aluno;
import com.ccqsantos.todolist.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired //inversao de dependencia pelo spring
    private AlunoService service;

    @PostMapping
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
        Aluno created = service.create(aluno);
        return ResponseEntity.ok(created);
    }

    @GetMapping
    public ResponseEntity<Aluno> find(){
        Aluno t = new Aluno();
        return ResponseEntity.ok(t);
    }

    @PatchMapping
    public ResponseEntity<Aluno> update(Integer id, @RequestBody Aluno aluno) {
        Aluno updated = service.editAluno(id, aluno);
        return ResponseEntity.ok(updated);
        }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.deleteAluno(id);
    }
}
