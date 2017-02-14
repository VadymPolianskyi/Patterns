package com.polyanski.abstract_factory.elf;

import com.polyanski.abstract_factory.Archer;
import com.polyanski.abstract_factory.Mage;
import com.polyanski.abstract_factory.SquadronFactory;
import com.polyanski.abstract_factory.Warrior;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 21:38
 */

public class ElfSquadronFactory extends SquadronFactory {

    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
