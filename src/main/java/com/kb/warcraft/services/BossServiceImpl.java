package com.kb.warcraft.services;

import com.kb.warcraft.api.mapper.BossMapper;
import com.kb.warcraft.api.model.BossDTO;
import com.kb.warcraft.domain.Boss;
import com.kb.warcraft.repositories.BossRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.kb.warcraft.domain.Boss.savedBoss;

@Service
public class BossServiceImpl implements BossService {

    BossRepository bossRepository;
    BossMapper bossMapper;

    public BossServiceImpl(BossRepository bossRepository, BossMapper bossMapper) {
        this.bossRepository = bossRepository;
        this.bossMapper = bossMapper;
    }

    @Override
    public BossDTO getBossById(Long id) {
        return bossMapper.bossToBossDTO(bossRepository.findById(id).get());
    }

    @Override
    public List<BossDTO> getBossByNameBoss(String nameBoss) {
        return bossRepository.getBossByNameBoss(nameBoss)
                .stream()
                .map(bossMapper::bossToBossDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BossDTO createNewBoss(BossDTO bossDTO) {
        Boss boss = bossMapper.bossDTOToBoss(bossDTO);
        savedBoss = bossRepository.save(boss);

        return bossMapper.bossToBossDTO(savedBoss);
    }

    @Override
    public BossDTO updateBoss(Long id, BossDTO bossDTO) {
        Boss boss = bossMapper.bossDTOToBoss(bossDTO);
        boss.setId(id);

        Boss savedBoss = bossRepository.save(boss);
        return bossMapper.bossToBossDTO(savedBoss);
    }

    @Override
    public void deleteBossById(Long id) {
        bossRepository.deleteById(id);
    }

}
