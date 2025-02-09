package com.gachas.Projeto_Gacha_API_Rest.dto;

import com.gachas.Projeto_Gacha_API_Rest.entities.Personagens;
import com.gachas.Projeto_Gacha_API_Rest.projections.GachaProjection;

public class GachaMinDto {
    private Integer idPersonagem;
    private String nomePersonagem;
    private String armaPersonagem;
    private String gachaDoPersonagem;
    private String elementoPersonagem;

    public GachaMinDto(Personagens entity){
        idPersonagem = entity.getIdPersonagem();
        nomePersonagem = entity.getNomePersonagem();
        armaPersonagem = entity.getArmaPersonagem();
        gachaDoPersonagem = entity.getGachaDoPersonagem();
        elementoPersonagem = entity.getElementoPersonagem();
    }

    public GachaMinDto(GachaProjection projection){
        idPersonagem = projection.getIdPersonagem();
        nomePersonagem = projection.getNomePersonagem();
        armaPersonagem = projection.getArmaPersonagem();
        gachaDoPersonagem = projection.getGachaDoPersonagem();
        elementoPersonagem = projection.GetElementoPersonagem();
    }

    public Integer getIdPersonagem() {
        return idPersonagem;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public String getArmaPersonagem() {
        return armaPersonagem;
    }

    public String getGachaDoPersonagem() {
        return gachaDoPersonagem;
    }

    public String getElementoPersonagem() {
        return elementoPersonagem;
    }
}
