package com.kb.warcraft.api.mapper;

import com.kb.warcraft.api.model.RaceDTO;
import com.kb.warcraft.domain.Race;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RaceMapper {

    RaceMapper INSTANCE = Mappers.getMapper(RaceMapper.class);
    RaceDTO raceToRaceDTO(Race race);
    Race raceDTOToRace(RaceDTO raceDTO);
}
