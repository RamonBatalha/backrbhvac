package com.rbhvac.demo.dataVoV1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({"id","nome","cpf","endereço","telefone","email","observacao"})
public class ClientsVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    
    private Long id;
    private String nome;
    private String endereço;
    private Long cpf;
    private Long telefone;
    private String email;
    private String observacao;
    
    
    public ClientsVO() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereço() {
        return endereço;
    }


    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }


    public Long getCpf() {
        return cpf;
    }


    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }


    public Long getTelefone() {
        return telefone;
    }


    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getObservacao() {
        return observacao;
    }


    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ClientsVO other = (ClientsVO) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (endereço == null) {
            if (other.endereço != null)
                return false;
        } else if (!endereço.equals(other.endereço))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (observacao == null) {
            if (other.observacao != null)
                return false;
        } else if (!observacao.equals(other.observacao))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        return true;
    }

    

   


   


    
}
