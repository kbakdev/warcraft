package com.kb.warcraft.controllers;

import com.kb.warcraft.api.model.RaceDTO;
import com.kb.warcraft.api.model.RaceListDTO;
import com.kb.warcraft.services.RaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/race/")
public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public RaceDTO getRaceById(@PathVariable Long id) {
        return raceService.getRaceById(id);
    }

    @GetMapping("findByName/{nameRace}")
    public ResponseEntity<RaceListDTO> getRaceByNameRaceRace(@PathVariable String nameRace) {
        return new ResponseEntity<RaceListDTO>(
                new RaceListDTO(raceService.getRaceByNameRaceRace(nameRace)), HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<RaceDTO> createNewRace(@RequestBody RaceDTO raceDTO) {
        return new ResponseEntity<RaceDTO>(raceService.createNewRace(raceDTO), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<RaceDTO> updateRace(@PathVariable Long id, @RequestBody RaceDTO raceDTO) {
        return new ResponseEntity<RaceDTO>(raceService.updateRace(id, raceDTO), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteRace(@PathVariable Long id) {

        raceService.deleteRaceById(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
