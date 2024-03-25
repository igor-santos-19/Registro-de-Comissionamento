package com.comissionamento.comissionamentoneoenergia.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comissionamento.comissionamentoneoenergia.models.ordemdeservicoconcluida;
import com.comissionamento.comissionamentoneoenergia.respositories.ordemdeservicoconcluidaRepositories;

import jakarta.transaction.Transactional;

//Arquivo responsavel por realizar o CRUD da tabela de ordemdeserviço concluida ****Faz praticamente a mesma coisa da do Service pedente*****

@Service

public class ordemdeservicoconcluidaService {

    @Autowired
    private ordemdeservicoconcluidaRepositories ordemdeservicoconcluidaRepositories;

    public ordemdeservicoconcluida findById(Integer id){ //Funcao para procurar a ose pelo id
         Optional<ordemdeservicoconcluida> ordemdeservicoconcluida = this.ordemdeservicoconcluidaRepositories.findById(id);
         return ordemdeservicoconcluida.orElseThrow(()-> new RuntimeException(
            "Ordem de Serviço Concluida não encontrada " + id + " Tipo: " + ordemdeservicoconcluida.class.getName()
         ));
    }

    @Transactional
    public ordemdeservicoconcluida create(ordemdeservicoconcluida obj){ //Funcao para criar uma ose pendente 
        obj = this.ordemdeservicoconcluidaRepositories.save(obj);
        return obj;
    }

    @Transactional
    public ordemdeservicoconcluida update(ordemdeservicoconcluida obj){ //Funcao para fazer um update na ose
        ordemdeservicoconcluida newObj = findById(obj.getId());
        return this.ordemdeservicoconcluidaRepositories.save(newObj);
    }

    public void delete(Integer Id){ //Funcao para deletar uma ose 
        findById(Id);
        try {
            this.ordemdeservicoconcluidaRepositories.deleteById(Id);   
        } catch (Exception e){
            throw new RuntimeException("Não foi possivel deletar a ordem concluida");
        }
    }
    
}
