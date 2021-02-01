package com.kb.warcraft.services;

import com.kb.warcraft.api.model.BossDTO;

import java.util.List;

public interface BossService {

    BossDTO getBossById(Long id);

    List<BossDTO> getBossByNameBoss(String nameBoss);

    BossDTO createNewBoss(BossDTO bossDTO);

    BossDTO updateBoss(Long id, BossDTO bossDTO);

    void deleteBossById(Long id);

}
