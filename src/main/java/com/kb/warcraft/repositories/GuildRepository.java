package com.kb.warcraft.repositories;

import com.kb.warcraft.domain.Guild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuildRepository extends JpaRepository<Guild, Long> {

    List<Guild> getByName(String name);
}
