package com.kb.warcraft.api.mapper;

import com.kb.warcraft.api.model.GuildDTO;
import com.kb.warcraft.domain.Guild;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GuildMapper {

    GuildMapper INSTANCE = Mappers.getMapper(GuildMapper.class);
    GuildDTO guildToGuildDTO(Guild guild);
    Guild guildDTOToGuild(GuildDTO guildDTO);
}
