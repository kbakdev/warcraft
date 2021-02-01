package com.kb.warcraft.repositories;

import com.kb.warcraft.domain.Boss;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BossRepository extends JpaRepository<Boss, Long> {
    List<Boss> getBossByNameBoss(String nameBoss);
}
