package com.polyanski.abstract_factory.elf;

import com.polyanski.abstract_factory.Archer;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 21:42
 */
public class ElfArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Elf archer shoot");
    }
}
