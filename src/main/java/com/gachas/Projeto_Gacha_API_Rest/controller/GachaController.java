package com.gachas.Projeto_Gacha_API_Rest.controller;


import com.gachas.Projeto_Gacha_API_Rest.dto.GachaMinDto;
import com.gachas.Projeto_Gacha_API_Rest.services.GachaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gachas")

public class GachaController {

    @Autowired
    private GachaServices gachaServices;

    @GetMapping
    public List<GachaMinDto> findAllGachaMinDtos() {
        return gachaServices.findAllGachaMinDtos();
    }
}
