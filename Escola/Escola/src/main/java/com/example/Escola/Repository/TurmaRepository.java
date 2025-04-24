package com.example.Escola.Repository;

import com.example.Escola.Entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TurmaRepository extends JpaRepository<Turma, Long> {

    List<Turma> findById(long id);

    List<Turma> findByNome(String nome);
}
