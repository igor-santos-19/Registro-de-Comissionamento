package com.comissionamento.comissionamentoneoenergia.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

// Cria a tabela Ordem De Serviço Conluida no BD

@Entity 
@Table(name ="ordemdeservicoconcluida")
public class ordemdeservicoconcluida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
    private Integer diasatraso;

    @Column(length = 255)
    private String termos;

    @Column(name = "dataenvio")
    @Temporal(TemporalType.DATE)
    private Date dataenvio;
}
