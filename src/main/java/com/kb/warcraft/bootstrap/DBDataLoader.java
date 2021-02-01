package com.kb.warcraft.bootstrap;

import com.kb.warcraft.domain.Boss;
import com.kb.warcraft.domain.Guild;
import com.kb.warcraft.domain.Race;
import com.kb.warcraft.domain.Weapon;
import com.kb.warcraft.repositories.BossRepository;
import com.kb.warcraft.repositories.GuildRepository;
import com.kb.warcraft.repositories.RaceRepository;
import com.kb.warcraft.repositories.WeaponRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataLoader implements CommandLineRunner {

    BossRepository bossRepository;
    GuildRepository guildRepository;
    RaceRepository raceRepository;
    WeaponRepository weaponRepository;

    public DBDataLoader(BossRepository bossRepository, GuildRepository guildRepository, RaceRepository raceRepository, WeaponRepository weaponRepository) {
        this.bossRepository = bossRepository;
        this.guildRepository = guildRepository;
        this.raceRepository = raceRepository;
        this.weaponRepository = weaponRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //boss

        Boss number1 = new Boss();
        number1.setNameBoss("Lich King");

        Boss number2 = new Boss();
        number2.setNameBoss("Ogre Chef");

        Boss number3 = new Boss();
        number3.setNameBoss("Devos");

        Boss number4 = new Boss();
        number4.setNameBoss("Doctor Ickus");

        Boss number5 = new Boss();
        number5.setNameBoss("Stone Legion");

        Boss number6 = new Boss();
        number6.setNameBoss("Lady Inerva");

        Boss number7 = new Boss();
        number7.setNameBoss("Huntsman Altimor");

        Boss number8 = new Boss();
        number8.setNameBoss("Shriekwing");

        Boss number9 = new Boss();
        number9.setNameBoss("Sire Denathrius");

        Boss number10 = new Boss();
        number10.setNameBoss("Ragnaros");

        bossRepository.save(number1);
        bossRepository.save(number2);
        bossRepository.save(number3);
        bossRepository.save(number4);
        bossRepository.save(number5);
        bossRepository.save(number6);
        bossRepository.save(number7);
        bossRepository.save(number8);
        bossRepository.save(number9);
        bossRepository.save(number10);

        //guilds

        Guild method = new Guild();
        method.setName("Method");
        method.setMembers(10);
        method.setAchievements(200);

        guildRepository.save(method);

        //race
        Race orc = new Race();
        orc.setNameRace("Orc");
        raceRepository.save(orc);

        //weapons
        Weapon frostmourne = new Weapon();
        frostmourne.setWeaponName("Frostmourne");
        frostmourne.setType("sword");
        weaponRepository.save(frostmourne);

        System.out.println("Data loaded to DB");
    }
}
