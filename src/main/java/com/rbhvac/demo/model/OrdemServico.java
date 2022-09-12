package com.rbhvac.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
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

    public OrdemServico() {
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

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((clients == null) ? 0 : clients.hashCode());
        result = prime * result + ((colaborador == null) ? 0 : colaborador.hashCode());
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
        OrdemServico other = (OrdemServico) obj;
        if (clients == null) {
            if (other.clients != null)
                return false;
        } else if (!clients.equals(other.clients))
            return false;
        if (colaborador == null) {
            if (other.colaborador != null)
                return false;
        } else if (!colaborador.equals(other.colaborador))
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
