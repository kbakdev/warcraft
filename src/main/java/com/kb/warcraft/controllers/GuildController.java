package com.kb.warcraft.controllers;

import com.kb.warcraft.api.model.GuildDTO;
import com.kb.warcraft.api.model.GuildListDTO;
import com.kb.warcraft.services.GuildService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/guild/")
public class GuildController {
    private final GuildService guildService;

    public GuildController(GuildService guildService) {
        this.guildService = guildService;
    }

    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public GuildDTO getGuildById(@PathVariable Long id) {
        return guildService.getGuildById(id);
    }

    @PostMapping
    public ResponseEntity<GuildDTO> createNewGuild(@RequestBody GuildDTO guildDTO) {
        return new ResponseEntity<GuildDTO>(guildService.createNewGuild(guildDTO), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<GuildDTO> updateGuild(@PathVariable Long id, @RequestBody GuildDTO guildDTO) {
        return new ResponseEntity<GuildDTO>(guildService.updateGuild(id, guildDTO), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteGuild(@PathVariable Long id) {
        guildService.deleteGuildById(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
