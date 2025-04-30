package com.example.Escola.DTO;


import com.example.Escola.Entity.Aluno;
import com.example.Escola.Entity.Turma;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoDTO implements Serializable {
    private long id;
    private String nome;
    private String cpf;

    @JsonIgnore // json de retorno de uma busca(GET) nao aparece esse atributo
    private Turma turma;

    public Aluno toAluno(){
        return new Aluno (
          this.id,
          this.nome,
          this.cpf
        );

    }
    public AlunoDTO fromAluno(Aluno usuario){
        return new AlunoDTO(
                usuario.getId(),
                usuario.getNome(),
                usuario.getCpf(),
                usuario.getTurma()
        );
    }
}
