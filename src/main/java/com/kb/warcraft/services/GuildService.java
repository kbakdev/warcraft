package com.kb.warcraft.services;

import com.kb.warcraft.api.model.GuildDTO;

import java.util.List;

public interface GuildService {

    List<GuildDTO> getAllGuilds();
    GuildDTO getGuildById(Long id);
    List<GuildDTO> getGuildByName(String name);
    GuildDTO createNewGuild(GuildDTO guildDTO);
    GuildDTO updateGuild(Long id, GuildDTO guildDTO);
    void deleteGuildById(Long id);
}
