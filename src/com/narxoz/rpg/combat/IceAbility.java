package com.narxoz.rpg.combat;
public class IceAbility implements Ability {
    private String name;
    private int damage;
    public IceAbility(String name, int damage) { this.name = name; this.damage = damage; }
    @Override public String getName() { return name; }
    @Override public int getDamage() { return damage; }
    @Override public String getDescription() { return "Мұзды қатыру: " + name; }
    @Override public Ability clone() { return new IceAbility(this.name, this.damage); }
}