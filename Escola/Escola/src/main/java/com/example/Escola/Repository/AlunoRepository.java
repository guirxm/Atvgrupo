package com.example.Escola.Repository;

import com.example.Escola.Entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    List<Aluno> findById(long id);

    List<Aluno> findByCpf(String cpf);
}
