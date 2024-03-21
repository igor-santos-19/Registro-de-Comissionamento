package com.comissionamento.comissionamentoneoenergia.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comissionamento.comissionamentoneoenergia.models.ordemdeservicoconcluida;

@Repository
public interface ordemdeservicoconcluidaRepositories extends JpaRepository<ordemdeservicoconcluida, Integer> {

    ordemdeservicoconcluida findByid(Integer id);
    
} 