package com.kb.warcraft.api.model;

import lombok.Data;

@Data
public class RaceDTO {
    Long id;
    String nameRace;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameRace() {
        return nameRace;
    }

    public void setNameRace(String nameRace) {
        this.nameRace = nameRace;
    }
}
