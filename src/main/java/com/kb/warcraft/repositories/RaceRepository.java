package com.kb.warcraft.repositories;

import com.kb.warcraft.domain.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {

    List<Race> getRaceByNameRace(String name);

}
