package com.kb.warcraft.repositories;

import com.kb.warcraft.domain.Race;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RaceRepository extends JpaRepository<Race, Long> {

    List<Race> getRaceByNameRace(String name);

}
