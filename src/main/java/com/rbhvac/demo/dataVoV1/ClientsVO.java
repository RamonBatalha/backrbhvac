package com.rbhvac.demo.dataVoV1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonPropertyOrder({"id","nome","cpf","endereço","telefone","email","observacao", "ordemServicos"})
public class ClientsVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private Long id;
    private String nome;
    private String endereço;
    private String cpf;
    private String telefone;
    private String email;
    private String observacao;
    
   
}
