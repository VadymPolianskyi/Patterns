package com.polyanski.abstract_factory.elf;

import com.polyanski.abstract_factory.Mage;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 21:42
 */
public class ElfMage implements Mage{

    @Override
    public void cast() {
        System.out.println("Elf mage cast");
    }
}
