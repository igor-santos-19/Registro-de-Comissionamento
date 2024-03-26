package com.comissionamento.comissionamentoneoenergia.respositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comissionamento.comissionamentoneoenergia.models.ordemdeservicoconcluida;

@Repository

//Arquivo respository basicamente é responsavel pelas consultas usando meio q uma funcao automatica de busca do spring

public interface ordemdeservicoconcluidaRepositories extends JpaRepository<ordemdeservicoconcluida, Integer> {

    ordemdeservicoconcluida findByid(Integer id); //Teste de consulta usando o metodo de busca do propio spring essa e a funcao automatica citada acima 

    void deleteById(Long id);

    Optional<ordemdeservicoconcluida> findById(Long long1);
    
} 