package com.rbhvac.demo.dataVoV1;

import java.io.Serializable;
import java.util.Date;

import com.rbhvac.demo.model.Clients;
import com.rbhvac.demo.model.Colaborador;


public class OrdemServicoVO implements Serializable{
    
    private Long id;
    private String servico;
    private float valor;
    private Date dataabertura;
    private String status;
    private Clients IdClientes;
    private Colaborador IdColaborador;

    public OrdemServicoVO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataabertura() {
        return dataabertura;
    }

    public void setDataabertura(Date dataabertura) {
        this.dataabertura = dataabertura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Clients getIdClientes() {
        return IdClientes;
    }

    public void setIdClientes(Clients idClientes) {
        IdClientes = idClientes;
    }

    public Colaborador getIdColaborador() {
        return IdColaborador;
    }

    public void setIdColaborador(Colaborador idColaborador) {
        IdColaborador = idColaborador;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((IdClientes == null) ? 0 : IdClientes.hashCode());
        result = prime * result + ((IdColaborador == null) ? 0 : IdColaborador.hashCode());
        result = prime * result + ((dataabertura == null) ? 0 : dataabertura.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((servico == null) ? 0 : servico.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + Float.floatToIntBits(valor);
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
        OrdemServicoVO other = (OrdemServicoVO) obj;
        if (IdClientes == null) {
            if (other.IdClientes != null)
                return false;
        } else if (!IdClientes.equals(other.IdClientes))
            return false;
        if (IdColaborador == null) {
            if (other.IdColaborador != null)
                return false;
        } else if (!IdColaborador.equals(other.IdColaborador))
            return false;
        if (dataabertura == null) {
            if (other.dataabertura != null)
                return false;
        } else if (!dataabertura.equals(other.dataabertura))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (servico == null) {
            if (other.servico != null)
                return false;
        } else if (!servico.equals(other.servico))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
            return false;
        return true;
    }

   
    
}
