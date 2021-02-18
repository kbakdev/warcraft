package com.kb.warcraft.api.mapper;

import com.kb.warcraft.api.model.WeaponDTO;
import com.kb.warcraft.domain.Weapon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface WeaponMapper {

    WeaponMapper INSTANCE = Mappers.getMapper(WeaponMapper.class);
    WeaponDTO weaponToWeaponDTO(Weapon weapon);
    Weapon weaponDTOToWeapon(WeaponDTO weaponDTO);
}
