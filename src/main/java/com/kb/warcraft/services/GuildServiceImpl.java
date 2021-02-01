package com.kb.warcraft.services;

import com.kb.warcraft.api.mapper.GuildMapper;
import com.kb.warcraft.api.model.GuildDTO;
import com.kb.warcraft.domain.Guild;
import com.kb.warcraft.repositories.GuildRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public abstract class GuildServiceImpl implements GuildService {
    GuildRepository guildRepository;
    GuildMapper guildMapper;

    public GuildServiceImpl(GuildRepository guildRepository, GuildMapper guildMapper) {
        this.guildRepository = guildRepository;
        this.guildMapper = guildMapper;
    }

    @Override
    public List<GuildDTO> getAllGuilds() {
        return guildRepository.findAll()
                .stream()
                .map(guildMapper::guildToGuildDTO)
                .collect(Collectors.toList());
    }

    @Override
    public GuildDTO getGuildById(Long id) {
        return guildMapper.guildToGuildDTO(guildRepository.findById(id).get());
    }

    @Override
    public List<GuildDTO> getGuildByName(String name) {
        return guildRepository.getByName(name)
                .stream()
                .map(guildMapper::guildToGuildDTO)
                .collect(Collectors.toList());
    }

    @Override
    public GuildDTO updateGuild(Long id, GuildDTO guildDTO) {
        Guild guild = guildMapper.guildDTOToGuild(guildDTO);
        guild.setId(id);

        Guild savedGuild = guildRepository.save(guild);
        return guildMapper.guildToGuildDTO(savedGuild);
    }

    @Override
    public void deleteGuildById(Long id) {
        guildRepository.deleteById(id);
    }
}
