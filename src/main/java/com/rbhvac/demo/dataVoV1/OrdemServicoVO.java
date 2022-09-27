package com.rbhvac.demo.dataVoV1;

import java.io.Serializable;
import java.util.Date;

import com.rbhvac.demo.model.Clients;
import com.rbhvac.demo.model.Colaborador;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrdemServicoVO implements Serializable{
    
    private Long id;
    private String servico;
    private float valor;
    private Date dataabertura;
    private String status;
    private Clients IdClientes;
    private Colaborador IdColaborador;

 
    
}
