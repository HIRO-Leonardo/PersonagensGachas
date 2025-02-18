package com.gachas.Projeto_Gacha_API_Rest.controller;


import com.gachas.Projeto_Gacha_API_Rest.dto.GachaMinDto;
import com.gachas.Projeto_Gacha_API_Rest.entities.Personagens;
import com.gachas.Projeto_Gacha_API_Rest.repository.GachasRepository;
import com.gachas.Projeto_Gacha_API_Rest.services.GachaServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/gachas")

public class GachaController {

    @Autowired
    private GachaServices gachaServices;
    @Autowired
    private GachasRepository gachasRepository;

    @GetMapping
    public List<GachaMinDto> findAllGachaMinDtos() {
        return gachaServices.findAllGachaMinDtos();
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Personagens> postGacha(@RequestBody @Valid Personagens personagens ){
            Personagens personagem = gachasRepository.save(personagens);


            return new ResponseEntity<Personagens>(personagem, HttpStatus.CREATED);





    }
}
