package com.kb.warcraft.repositories;

import com.kb.warcraft.domain.Guild;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuildRepository extends JpaRepository<Guild, Long> {

    List<Guild> getByName(String name);
}
