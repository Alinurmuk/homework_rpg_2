package com.narxoz.rpg.combat;
public class ShadowAbility implements Ability {
    private String name;
    private int damage;
    public ShadowAbility(String name, int damage) { this.name = name; this.damage = damage; }
    @Override public String getName() { return name; }
    @Override public int getDamage() { return damage; }
    @Override public String getDescription() { return "Көлеңкелі магия: " + name; }
    @Override public Ability clone() { return new ShadowAbility(this.name, this.damage); }
}