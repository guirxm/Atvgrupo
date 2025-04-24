package com.example.Escola.Controller;


import com.example.Escola.DTO.AlunoDTO;
import com.example.Escola.Entity.Aluno;
import com.example.Escola.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aluno")
@CrossOrigin(origins = "http://localhost:5500")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/{id}")
    public ResponseEntity<AlunoDTO> getById(@PathVariable Long id){
        Optional<AlunoDTO> alunoDTOOptional = alunoService.getById(id); // realiza a busca do usuário com base no id
        if(alunoDTOOptional.isPresent()){ // tratamento do retorno
            return ResponseEntity.ok(alunoDTOOptional.get()); // existir usuário com esse id retorna StatusHttp 200 e o objeto encontrato
        }else {
            return ResponseEntity.notFound().build(); // se não encontrar retorna apenas status 404
        }
    }



}