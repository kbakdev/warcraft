package com.kb.warcraft.services;

import com.kb.warcraft.api.model.RaceDTO;

import java.util.List;

public interface RaceService {
    List<RaceDTO> getAllRaces();
    RaceDTO getRaceById(Long id);
    List<RaceDTO> getRaceByNameRaceRace(String nameRace);
    RaceDTO createNewRace(RaceDTO raceDTO);
    RaceDTO updateRace(Long id, RaceDTO raceDTO);
    void deleteRaceById(Long id);
}
