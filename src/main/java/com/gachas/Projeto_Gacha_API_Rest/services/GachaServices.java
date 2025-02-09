package com.gachas.Projeto_Gacha_API_Rest.services;

import com.gachas.Projeto_Gacha_API_Rest.dto.GachaMinDto;
import com.gachas.Projeto_Gacha_API_Rest.repository.GachaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GachaServices {
    @Autowired
    private GachaRepository gachaRepository;

    @Transactional(readOnly = true)
    public List<GachaMinDto> findAllGachaMinDtos() {
        var result = gachaRepository.findAll();
        List<GachaMinDto> dto = result.stream().map(x -> new GachaMinDto(x)).toList();
        return dto;
    }
}
