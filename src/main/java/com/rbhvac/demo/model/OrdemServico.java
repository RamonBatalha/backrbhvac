package com.rbhvac.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class OrdemServico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String servico;

    @Column(nullable = false)
    private float valor;

    @Column(nullable = false)
    private Date dataabertura;

    @Column(nullable = false)
    private String status;
     
    @ManyToOne
    @JoinColumn(name="Id_Cliente")
    private Clients clients;
     
    @ManyToOne
    @JoinColumn(name="Id_Colaborador")
    private Colaborador colaborador;

   
}
