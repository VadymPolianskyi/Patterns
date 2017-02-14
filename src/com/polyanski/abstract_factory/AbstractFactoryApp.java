package com.polyanski.abstract_factory;

import com.polyanski.abstract_factory.elf.ElfSquadronFactory;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 21:45
 */
public class AbstractFactoryApp {
    public static void main(String[] args) {
        SquadronFactory factory = new ElfSquadronFactory();

        Mage elfMage = factory.createMage();
        Archer elfArcher = factory.createArcher();
        Warrior elfWarrior = factory.createWarrior();

        elfMage.cast();
        elfArcher.shoot();
        elfWarrior.attack();
    }
}
