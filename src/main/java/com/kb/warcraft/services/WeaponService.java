package com.kb.warcraft.services;

import com.kb.warcraft.api.model.WeaponDTO;

import java.util.List;

public interface WeaponService {
    List<WeaponDTO> getAllWeapons();
    WeaponDTO getWeaponById(Long id);
    List<WeaponDTO> getWeaponByWeaponName(String weaponName);
    WeaponDTO createNewWeapon(WeaponDTO weaponDTO);
    WeaponDTO updateWeapon(Long id, WeaponDTO weaponDTO);
    void deleteWeaponById(Long id);
}
