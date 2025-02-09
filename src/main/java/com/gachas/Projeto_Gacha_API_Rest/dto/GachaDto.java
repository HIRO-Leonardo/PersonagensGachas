package com.gachas.Projeto_Gacha_API_Rest.dto;

import com.gachas.Projeto_Gacha_API_Rest.entities.Personagens;

public class GachaDto {
    private Integer idPersonagem;
    private String nomePersonagem;
    private String armaPersonagem;
    private String gachaDoPersonagem;
    private String elementoPersonagem;

    public GachaDto(){

    }

    public GachaDto(Personagens entity) {

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
}
