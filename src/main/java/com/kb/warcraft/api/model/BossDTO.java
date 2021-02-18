package com.kb.warcraft.api.model;

import lombok.Data;

@Data
public class BossDTO {

    Long id;
    String nameBoss;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameBoss() {
        return nameBoss;
    }

    public void setNameBoss(String nameBoss) {
        this.nameBoss = nameBoss;
    }
}
