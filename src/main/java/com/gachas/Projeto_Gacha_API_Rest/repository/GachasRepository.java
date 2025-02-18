package com.gachas.Projeto_Gacha_API_Rest.repository;

import com.gachas.Projeto_Gacha_API_Rest.entities.Personagens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GachasRepository extends JpaRepository<Personagens, Integer> {

}
