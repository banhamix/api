package com.senai.api.repositores;

import com.senai.api.emtities.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefas,Long> {

}
