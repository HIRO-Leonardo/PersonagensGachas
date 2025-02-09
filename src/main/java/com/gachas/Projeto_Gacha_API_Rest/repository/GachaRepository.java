package com.gachas.Projeto_Gacha_API_Rest.repository;


import com.gachas.Projeto_Gacha_API_Rest.dto.GachaMinDto;
import com.gachas.Projeto_Gacha_API_Rest.entities.Personagens;

import com.gachas.Projeto_Gacha_API_Rest.projections.GachaProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GachaRepository extends JpaRepository<Personagens, Integer> {
    @Query(nativeQuery = true, value = "select * from personagens;")
    List<GachaProjection> findAllGachaProjections();
}
