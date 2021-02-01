package com.kb.warcraft.services;

import com.kb.warcraft.api.mapper.WeaponMapper;
import com.kb.warcraft.api.model.WeaponDTO;
import com.kb.warcraft.domain.Weapon;
import com.kb.warcraft.repositories.WeaponRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.kb.warcraft.domain.Weapon.savedWeapon;

@Service
public class WeaponServiceImpl implements WeaponService {
    WeaponRepository weaponRepository;
    WeaponMapper weaponMapper;

    public WeaponServiceImpl(WeaponRepository weaponRepository, WeaponMapper weaponMapper) {
        this.weaponRepository = weaponRepository;
        this.weaponMapper = weaponMapper;
    }

    @Override
    public List<WeaponDTO> getAllWeapons() {
        return weaponRepository.findAll()
                .stream()
                .map(weaponMapper::weaponToWeaponDTO)
                .collect(Collectors.toList());
    }

    @Override
    public WeaponDTO getWeaponById(Long id) {
        return weaponMapper.weaponToWeaponDTO(weaponRepository.findById(id).get());
    }

    @Override
    public List<WeaponDTO> getWeaponByWeaponName(String weaponName) {
        return weaponRepository.getWeaponByWeaponName(weaponName)
                .stream()
                .map(weaponMapper::weaponToWeaponDTO)
                .collect(Collectors.toList());
    }

    @Override
    public WeaponDTO createNewWeapon(WeaponDTO weaponDTO) {
        Weapon weapon = weaponMapper.weaponDTOToWeapon(weaponDTO);
        savedWeapon = weaponRepository.save(weapon);

        return weaponMapper.weaponToWeaponDTO(savedWeapon);
    }

    @Override
    public WeaponDTO updateWeapon(Long id, WeaponDTO weaponDTO) {
        Weapon weapon = weaponMapper.weaponDTOToWeapon(weaponDTO);
        weapon.setId(id);

        Weapon savedWeapon = weaponRepository.save(weapon);
        return weaponMapper.weaponToWeaponDTO(savedWeapon);
    }

    @Override
    public void deleteWeaponById(Long id) {
        weaponRepository.deleteById(id);
    }
}
