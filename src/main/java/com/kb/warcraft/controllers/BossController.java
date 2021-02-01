package com.kb.warcraft.controllers;

import com.kb.warcraft.api.model.BossDTO;
import com.kb.warcraft.api.model.BossListDTO;
import com.kb.warcraft.services.BossService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BossController {

    private final BossService bossService;

    public BossController(BossService bossService) {
        this.bossService = bossService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public BossDTO getBossById(@PathVariable Long id) {
        return bossService.getBossById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("findBossByNameBoss/{nameBoss}")
    public ResponseEntity<BossListDTO> getBossByNameBoss(@PathVariable String nameBoss) {
        return new ResponseEntity<BossListDTO>(
                new BossListDTO(bossService.getBossByNameBoss(nameBoss)), HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<BossDTO> createNewBoss(@RequestBody BossDTO bossDTO) {
        return new ResponseEntity<BossDTO>(bossService.createNewBoss(bossDTO), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<BossDTO> updateBoss(@PathVariable Long id, @RequestBody BossDTO bossDTO) {
        return new ResponseEntity<BossDTO>(bossService.updateBoss(id, bossDTO), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteBoss(@PathVariable Long id) {

        bossService.deleteBossById(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

