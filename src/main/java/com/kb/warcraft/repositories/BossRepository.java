package com.kb.warcraft.repositories;

import com.kb.warcraft.domain.Boss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BossRepository extends JpaRepository<Boss, Long> {
    List<Boss> getBossByNameBoss(String nameBoss);
}
