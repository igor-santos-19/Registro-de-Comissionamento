package com.comissionamento.comissionamentoneoenergia.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comissionamento.comissionamentoneoenergia.models.ordemdeservicopendente;

@Repository
public interface ordemdeservicopendenteRepositories extends JpaRepository <ordemdeservicopendente, Long > {

    ordemdeservicopendente findByCliente(Integer cliente);
    
}
