/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.domain;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author caique
 */
public class Banda {
    private int id;
    private String localDeOrigem;
    private String nomeFantasia;
    private List<Integrante> integrantes;

    public Banda() {
    }

    public Banda(int id, String localDeOrigem, String nomeFantasia, List<Integrante> integrantes) {
        this.id = id;
        this.localDeOrigem = localDeOrigem;
        this.nomeFantasia = nomeFantasia;
        this.integrantes = integrantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalDeOrigem() {
        return localDeOrigem;
    }

    public void setLocalDeOrigem(String localDeOrigem) {
        this.localDeOrigem = localDeOrigem;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.localDeOrigem);
        hash = 59 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 59 * hash + Objects.hashCode(this.integrantes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banda other = (Banda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.localDeOrigem, other.localDeOrigem)) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.integrantes, other.integrantes)) {
            return false;
        }
        return true;
    }
    
    
}
