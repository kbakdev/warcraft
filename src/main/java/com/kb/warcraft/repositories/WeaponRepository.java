package com.kb.warcraft.repositories;

import com.kb.warcraft.domain.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {
    List<Weapon> getWeaponByWeaponName(String weaponName);
}
