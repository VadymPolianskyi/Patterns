package com.polyanski.abstract_factory;

/**
 * Created by vadym on 13.02.17.
 */
public abstract class SquadronFactory {
    public abstract Mage createMage();
    public abstract Archer createArcher();
    public abstract Warrior createWarrior();
}
