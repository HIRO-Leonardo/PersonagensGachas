package com.gachas.Projeto_Gacha_API_Rest.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "personagens")
public class Personagens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersonagem")
    private Integer idPersonagem;

    @Column(name = "nomepersonagem")
    private String nomePersonagem;

    @Column(name = "armapersonagem")
    private String armaPersonagem;

    @Column(name = "gamepersonagem")
    private String gachaDoPersonagem;

    @Column(name = "elementopersonagem")
    private String elementoPersonagem;

    public Personagens(){

    }

    public Personagens(Integer idPersonagem, String nomePersonagem, String gachaDoPersonagem, String armaPersonagem, String elementoPersonagem) {
        this.idPersonagem = idPersonagem;
        this.nomePersonagem = nomePersonagem;
        this.gachaDoPersonagem = gachaDoPersonagem;
        this.armaPersonagem = armaPersonagem;
        this.elementoPersonagem = elementoPersonagem;


    }

    public Integer getIdPersonagem() {
        return idPersonagem;
    }

    public void setIdPersonagem(Integer idPersonagem) {
        this.idPersonagem = idPersonagem;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getArmaPersonagem() {
        return armaPersonagem;
    }

    public void setArmaPersonagem(String armaPersonagem) {
        this.armaPersonagem = armaPersonagem;
    }

    public String getGachaDoPersonagem() {
        return gachaDoPersonagem;
    }

    public void setGachaDoPersonagem(String gachaDoPersonagem) {
        this.gachaDoPersonagem = gachaDoPersonagem;
    }

    public String getElementoPersonagem() {
        return elementoPersonagem;
    }

    public void setElementoPersonagem(String elementoPersonagem) {
        this.elementoPersonagem = elementoPersonagem;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Personagens personagens = (Personagens) o;
        return Objects.equals(idPersonagem, personagens.idPersonagem);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPersonagem);
    }
}
