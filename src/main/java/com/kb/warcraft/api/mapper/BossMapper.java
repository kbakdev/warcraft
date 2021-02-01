package com.kb.warcraft.api.mapper;

import com.kb.warcraft.api.model.BossDTO;
import com.kb.warcraft.domain.Boss;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BossMapper {

    BossMapper INSTANCE = Mappers.getMapper(BossMapper.class);

    BossDTO bossToBossDTO(Boss boss);

    Boss bossDTOToBoss(BossDTO bossDTO);
}

