package com.polyanski.abstract_factory.elf;

import com.polyanski.abstract_factory.Warrior;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 21:43
 */
public class ElfWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("Elf warrior attack");
    }
}
