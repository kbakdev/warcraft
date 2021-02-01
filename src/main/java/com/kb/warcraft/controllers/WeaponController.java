package com.kb.warcraft.controllers;

import com.kb.warcraft.api.model.WeaponDTO;
import com.kb.warcraft.api.model.WeaponListDTO;
import com.kb.warcraft.services.WeaponService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weapon")
public class WeaponController {
    private final WeaponService weaponService;

    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public WeaponDTO getWeaponById(@PathVariable Long id) {
        return weaponService.getWeaponById(id);
    }

    @GetMapping("findWeaponName/{weaponName}")
    public ResponseEntity<WeaponListDTO> getWeaponByWeaponName(@PathVariable String weaponName) {
        return new ResponseEntity<WeaponListDTO>(
                new WeaponListDTO(weaponService.getWeaponByWeaponName(weaponName)), HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<WeaponDTO> createNewWeapon(@RequestBody WeaponDTO weaponDTO) {
        return new ResponseEntity<WeaponDTO>(weaponService.createNewWeapon(weaponDTO), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<WeaponDTO> updateWeapon(@PathVariable Long id, @RequestBody WeaponDTO weaponDTO) {
        return new ResponseEntity<WeaponDTO>(weaponService.updateWeapon(id, weaponDTO), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteWeapon(@PathVariable Long id) {
        weaponService.deleteWeaponById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
