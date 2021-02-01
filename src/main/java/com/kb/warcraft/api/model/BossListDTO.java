package com.kb.warcraft.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BossListDTO {
    private List<BossDTO> bossList;
}
