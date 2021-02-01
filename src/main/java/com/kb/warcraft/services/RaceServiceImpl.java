package com.kb.warcraft.services;

import com.kb.warcraft.api.mapper.RaceMapper;
import com.kb.warcraft.api.model.RaceDTO;
import com.kb.warcraft.domain.Race;
import com.kb.warcraft.repositories.RaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.kb.warcraft.domain.Race.savedRace;

@Service
public class RaceServiceImpl implements RaceService {
    RaceRepository raceRepository;
    RaceMapper raceMapper;

    public RaceServiceImpl(RaceRepository raceRepository, RaceMapper raceMapper) {
        this.raceRepository = raceRepository;
        this.raceMapper = raceMapper;
    }

    @Override
    public List<RaceDTO> getAllRaces() {
        return raceRepository.findAll()
                .stream()
                .map(raceMapper::raceToRaceDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RaceDTO getRaceById(Long id) {
        return raceMapper.raceToRaceDTO(raceRepository.findById(id).get());
    }

    @Override
    public List<RaceDTO> getRaceByNameRaceRace(String nameRace) {
        return raceRepository.getRaceByNameRace(nameRace)
                .stream()
                .map(raceMapper::raceToRaceDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RaceDTO createNewRace(RaceDTO raceDTO) {
        Race race = raceMapper.raceDTOToRace(raceDTO);
        savedRace = raceRepository.save(race);

        return raceMapper.raceToRaceDTO(savedRace);
    }

    @Override
    public RaceDTO updateRace(Long id, RaceDTO raceDTO) {
        Race race = raceMapper.raceDTOToRace(raceDTO);
        race.setId(id);

        Race savedRace = raceRepository.save(race);
        return raceMapper.raceToRaceDTO(savedRace);
    }

    @Override
    public void deleteRaceById(Long id) {
        raceRepository.deleteById(id);
    }
}
