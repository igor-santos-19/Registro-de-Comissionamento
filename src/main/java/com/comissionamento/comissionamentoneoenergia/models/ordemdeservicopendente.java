package com.comissionamento.comissionamentoneoenergia.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

 // Cria a tabela Ordem De Serviço Pendente no BD

@Entity 
@Table(name ="ordemdeservicopendente")

public class ordemdeservicopendente {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "integer", length = 255)
    private Integer cliente;

    @Column(columnDefinition = "integer", length = 255)
    private Integer protocolo;

    @Column(length = 255)
    private String empresa;

    @Column(length = 100)
    private String uteperesponsavel;

    @Column(length = 80)
    private String motivo;

    @Column(length = 20)
    private String situacao;

    @Column(length = 10)
    private String orgaoexecutor;

    @Column(length = 30)
    private String localose; //Local Ordem De Serviço

    @Column(name = "dataabertura")
    @Temporal(TemporalType.DATE)
    private Date dataabertura;

    @Column(name = "datalimite")
    @Temporal(TemporalType.DATE)
    private Date datalimite;

    @Column(name = "dataconclusao")
    @Temporal(TemporalType.DATE)
    private Date dataconclusao;

    @Column(length = 3)
    private String foradoprazo;

    @Column(length = 255)
    private Integer dias;

}