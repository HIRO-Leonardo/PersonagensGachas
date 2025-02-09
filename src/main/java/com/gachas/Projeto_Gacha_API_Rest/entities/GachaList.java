package com.gachas.Projeto_Gacha_API_Rest.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "nome_jogo")
public class GachaList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDoJogo;


    public GachaList(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDoJogo() {
        return nomeDoJogo;
    }

    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GachaList gachaList = (GachaList) o;
        return Objects.equals(id, gachaList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
